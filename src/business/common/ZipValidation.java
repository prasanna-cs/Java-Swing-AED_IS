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
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ZipValidation extends InputVerifier{
    
     @Override
    public boolean verify(JComponent input) {
        String t = ((JTextField) input).getText();
        if (t.length() > 0) {
            try {
                int k=Integer.parseInt(t);
                input.setBackground(Color.black);
                if(k<=0)
                {
                    input.setBackground(Color.red);
                    JOptionPane.showMessageDialog(input, "Please enter valid input(int values only)", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid input(int values only)", "Error in input", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            input.setBackground(Color.black);
            return true;
        }
    }
}
