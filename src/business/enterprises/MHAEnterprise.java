/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprises;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author prasanna
 */

public class MHAEnterprise extends Enterprise{
    
     public MHAEnterprise(String name) {
        super(name, EnterpriseType.MHA);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
