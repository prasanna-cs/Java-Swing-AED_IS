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
import userInterface.serviceSeeker.ServiceSeekerWorkAreaJPanel;

/**
 *
 * @author riaka
 */


public class ServiceSeekerRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ServiceSeekerWorkAreaJPanel(userProcessContainer, enterprise, account, business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
