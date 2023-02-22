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


public class PasswordValidation extends InputVerifier{
    
      @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        
        String pattern = "^([a-zA-Z+]+[!*#]+)$";
        
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 || text.matches(pattern) != true) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid Password. Pattern: Character followed by # or * or !", "Error in passowrd", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.black);
                return true;
            }
        }
        else
        {
            input.setBackground(Color.black);
            return true;
        }
    }
}
