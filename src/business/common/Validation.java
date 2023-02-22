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

import business.EcoSystem;
import business.enterprises.Enterprise;
import business.network.Network;
import business.organizations.DoctorOrganization;
import business.organizations.DonorOrganization;
import business.organizations.Organization;
import business.organizations.SupervisorOrganization;
import business.organizations.TransportOrganization;
import business.organizations.VolunteerOrganization;
import business.userAccount.UserAccount;
import java.util.Calendar;
import java.util.Date;


public class Validation {
    
    
    
    public static boolean validateString(String n)
    {
        return true;
    }
    
    public static int ageCalculator(Date birthDate)
    {
       try
       {     
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.setTime(birthDate);
        Calendar thisday = Calendar.getInstance();
        int calculatedAge = thisday.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        if (thisday.get(Calendar.DAY_OF_YEAR) <= dateOfBirth.get(Calendar.DAY_OF_YEAR))
        calculatedAge--;
        return calculatedAge;
       }
       catch(Exception e)
       {
        return 0;   
       }
    }
    
    
    public static VolunteerOrganization getVO(EcoSystem ecos, UserAccount uA)
    {
        VolunteerOrganization vo = null;
        try
        {
        for(Network n : ecos.getNetworkList())
        {
         if(n.equals(uA.getNetwork()))
         {
          for(Enterprise e : n.getEnterpriseDirectory().getEl())
          {
            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.School))
            {
            for(Organization o : e.getOrganizationDirectory().getOrganizationDirectory())
            {
             if(o instanceof VolunteerOrganization)
             {
              vo = (VolunteerOrganization)o; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return vo;
    }
    
    public static VolunteerOrganization getVoInNetwork(EcoSystem ecos, Network nw)
    {
        VolunteerOrganization vo = null;
        try
        {
        for(Network n : ecos.getNetworkList())
        {
         if(n.equals(nw))
         {
          for(Enterprise e : n.getEnterpriseDirectory().getEl())
          {
            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.School))
            {
            for(Organization o : e.getOrganizationDirectory().getOrganizationDirectory())
            {
             if(o instanceof VolunteerOrganization)
             {
              vo = (VolunteerOrganization)o; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException nullpointer)
        {
          nullpointer.printStackTrace();
         return null;
        }
        return vo;
    }
    
      public static DonorOrganization getDonorOrganization(EcoSystem ecos, UserAccount uA)
    {
        DonorOrganization dno = null;
        
        for(Network n : ecos.getNetworkList())
        {
         if(n.equals(uA.getNetwork()))
         {
          for(Enterprise e : n.getEnterpriseDirectory().getEl())
          {
            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.NGO))
            {
            for(Organization o : e.getOrganizationDirectory().getOrganizationDirectory())
            {
             if(o instanceof DonorOrganization)
             {
              dno = (DonorOrganization)o; 
             }
            }
            }
          }
         }
        }
        return dno;
    }
      
       public static TransportOrganization getTO(EcoSystem ecos, UserAccount uA)
    {
        TransportOrganization tno = null;
        
        for(Network n : ecos.getNetworkList())
        {
         if(n.equals(uA.getNetwork()))
         {
          for(Enterprise e : n.getEnterpriseDirectory().getEl())
          {
            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.School))
            {
            for(Organization o : e.getOrganizationDirectory().getOrganizationDirectory())
            {
             if(o instanceof TransportOrganization)
             {
              tno = (TransportOrganization)o; 
             }
            }
            }
          }
         }
        }
        return tno;
    } 
       
     public static DoctorOrganization getDoctorOrganization(EcoSystem ecos, UserAccount uA)
    {
        DoctorOrganization dno = null;
        try
        {
        for(Network n : ecos.getNetworkList())
        {
         if(n.equals(uA.getNetwork()))
         {
          for(Enterprise e : n.getEnterpriseDirectory().getEl())
          {
            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital))
            {
            for(Organization o : e.getOrganizationDirectory().getOrganizationDirectory())
            {
             if(o instanceof DoctorOrganization)
             {
              dno = (DoctorOrganization)o; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException nullpointer)
        {
          nullpointer.printStackTrace();
         return null;
        }
        return dno;
    }   
     
      public static SupervisorOrganization getSOrg(EcoSystem ecos, UserAccount uA)
    {
        SupervisorOrganization sno = null;
        try
        {
        for(Network n : ecos.getNetworkList())
        {
         if(n.equals(uA.getNetwork()))
         {
          for(Enterprise e : n.getEnterpriseDirectory().getEl())
          {
            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.SeniorSafe))
            {
            for(Organization o : e.getOrganizationDirectory().getOrganizationDirectory())
            {
             if(o instanceof SupervisorOrganization)
             {
              sno = (SupervisorOrganization)o; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException nullpointer)
        {
          nullpointer.printStackTrace();
         return null;
        }
        return sno;
    }  
      
 
}
