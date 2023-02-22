/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.common;

/**
 *
 * @author riaka
 */

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class PhoneNumberValidation extends InputVerifier{
    
     @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        
         String r = "^[6-9]{1}+[0-9]{9}$" ;
         Pattern phoneNumberPattern = Pattern.compile(r);
            Matcher matcher = phoneNumberPattern.matcher(text);
            if (text.length() > 0) {
               if (text.toLowerCase().startsWith(" ") || text.length() == 0 || matcher.matches() != true) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please Enter Valid number starting betweent 6 and 9", "Error in number", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.black);
                return true;
            }
            }    
        else {
            input.setBackground(Color.black);
            return true;
        }
    
   
    }
}
