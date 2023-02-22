/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizations;


import business.role.AdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */


public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
     
}
