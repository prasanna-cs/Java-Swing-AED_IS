/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprises;

import java.util.ArrayList;

/**
 *
 * @author prasanna
 */

public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> el;
    
    public EnterpriseDirectory()
    {
        el = new ArrayList<Enterprise>();
    }
    
    
    public Enterprise addEnterprise(String en, Enterprise.EnterpriseType et)
    {
      Enterprise e = null;
      if(et ==Enterprise.EnterpriseType.SeniorSafe)
      {
       e = new SeniorSafeEnterprise(en);
       el.add(e);     
      }
      else if (et == Enterprise.EnterpriseType.MHA){
            e = new MHAEnterprise(en);
            el.add(e);
        }
       else if (et == Enterprise.EnterpriseType.NGO){
            e = new NGOEnterprise(en);
            el.add(e);
        }
        else  if(et ==Enterprise.EnterpriseType.School)
        {
         e = new SchoolEnterprise(en);
         el.add(e);     
        }
      else  if(et ==Enterprise.EnterpriseType.Hospital)
        {
         e = new HospitalEnterprise(en);
         el.add(e);     
        }

      return e;
    }

    public ArrayList<Enterprise> getEl() {
        return el;
    }
    
    public void deleteEnterprise(Enterprise ep)
    {
        el.remove(ep);
    }
}
