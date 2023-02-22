/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizations;

import business.role.HealthMinisterRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */


public class HealthMinistryOrganization extends Organization {
    
     public HealthMinistryOrganization()
    {
        super(Organization.Type.HM.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HealthMinisterRole());
        return roles;
    }
    
}
