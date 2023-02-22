/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.common;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author riaka
 */


public class DOBValidation extends InputVerifier{
    
     @Override
    public boolean verify(JComponent jcompinput) {
        String text = ((JTextField) jcompinput).getText();
        
         String pattern = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$" ;
         Pattern dobPattern = Pattern.compile(pattern);
            Matcher matcher = dobPattern.matcher(text);
            if (text.length() > 0) {
               if (matcher.matches() != true) {
                jcompinput.setBackground(Color.black);
                JOptionPane.showMessageDialog(jcompinput, "Please Enter date Of Birth in format (MM/DD/YYYY)", "Error in DOB", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                jcompinput.setBackground(Color.black);
                return true;
            }
            }    
        else {
            jcompinput.setBackground(Color.white);
            return true;
        }
    
   
    }
  
}
