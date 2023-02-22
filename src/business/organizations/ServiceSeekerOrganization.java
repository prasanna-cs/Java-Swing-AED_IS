/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizations;

import business.role.ServiceSeekerRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */


public class ServiceSeekerOrganization extends Organization{
    
    public ServiceSeekerOrganization()
    {
        super(Organization.Type.SupportSeeker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ServiceSeekerRole());
        return roles;
    }
    
}
