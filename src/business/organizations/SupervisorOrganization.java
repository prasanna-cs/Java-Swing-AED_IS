/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizations;

import business.role.SeniorSafeManagerRole;
import business.role.Role;
import business.role.SupervisorRole;
import java.util.ArrayList;

/**
 *
 * @author riaka
 */


public class SupervisorOrganization extends Organization {
    
    public SupervisorOrganization()
    {
        super(Organization.Type.Supervisor.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupervisorRole());
        roles.add(new SeniorSafeManagerRole());
        return roles;
    }
    
    
}
