/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizations;

import business.role.DoctorRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */


public class DoctorOrganization extends Organization {
    
     public DoctorOrganization()
    {
        super(Organization.Type.Doctor.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
    
}
