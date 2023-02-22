/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprises.Enterprise;
import business.organizations.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.doctor.DoctorWorkAreaJPanel;

/**
 *
 * @author riaka
 */


public class DoctorRole extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    } 
}
