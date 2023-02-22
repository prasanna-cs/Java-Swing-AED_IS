package business;

import business.common.NeedService;
import business.enterprises.Enterprise;
import business.network.Network;
import business.organizations.Organization;
import business.person.Person;
import business.role.AdminRole;
import business.role.DoctorRole;
import business.role.DonorRole;
import business.role.DriverRole;
import business.role.SeniorSafeManagerRole;
import business.role.HealthMinisterRole;
import business.role.SupervisorRole;
import business.role.SystemAdminRole;
import business.userAccount.UserAccount;

/**
 *
 * @author riaka
 */


public class ConfigureASystem {
    
//    public static EcoSystem configure(){
//        
//        
//        
//        //Create a network
//        //create an enterprise
//        //initialize some organizations
//        //have some employees 
//        //create user account
//  
//        EcoSystem ecoSystem = populateEnterpriseData();
//        return ecoSystem;
//    }
    
    public static EcoSystem configure()
    {
        EcoSystem system = EcoSystem.getInstance();
        Person person = system.getPersonDirectory().addPerson();
        person.setPersonsFirstName("Sys");
        person.setlName("Admin");
        person.setName();
        
        UserAccount ua = system.getUserAccountDirectory().addUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        ua.setEnabled(true);
        
        NeedService needService = system.addNeedService();
        needService.setService("Snow Shovel");
        needService.setService("Grass Cutting");
        needService.setService("Gardening");
        needService.setService("Grocery Shopping");
       
        
        Network network = system.addNetwork();
      
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
    // School    
        Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise("NEU", Enterprise.EnterpriseType.School);
        person = enterprise.getPersonDirectory().addPerson();
        person.setlName("Neu Admin");
        person.setName();
        UserAccount account = enterprise.getUserAccountDirectory().addUserAccount("neu", "neu", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Volunteer);
        Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Transport);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setPersonsFirstName("Driver");
        person.setlName("Driver");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("driver", "driver", person, new DriverRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
      // Senior Safe
         enterprise = network.getEnterpriseDirectory().addEnterprise("SeniorSafe", Enterprise.EnterpriseType.SeniorSafe);
         person = enterprise.getPersonDirectory().addPerson();
        person.setlName("Senior Safe Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("seniorsafe", "seniorsafe", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.SupportSeeker);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Supervisor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setPersonsFirstName("Supervisor");
        person.setlName("Supervisor");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("supervisor", "supervisor", person, new SupervisorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        // Manager
        
        person = organization.getPersonDirectory().addPerson();    
          
        person.setPersonsFirstName("Manager");
        person.setlName("Manager");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("manager", "manager", person, new SeniorSafeManagerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
              // NGO
         enterprise = network.getEnterpriseDirectory().addEnterprise("NGO", Enterprise.EnterpriseType.NGO);
         person = enterprise.getPersonDirectory().addPerson();
        person.setlName("NGO Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("ngo", "ngo", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Donor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setPersonsFirstName("Donor");
        person.setlName("Donor");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("donor", "donor", person, new DonorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
                  // Hospital
         enterprise = network.getEnterpriseDirectory().addEnterprise("Hospital", Enterprise.EnterpriseType.Hospital);
         person = enterprise.getPersonDirectory().addPerson();
        person.setlName("hospital Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("hospital", "hospital", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Doctor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setPersonsFirstName("Doctor");
        person.setlName("Doctor");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("doctor", "doctor", person, new DoctorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
                // MHA
         enterprise = network.getEnterpriseDirectory().addEnterprise("MHA", Enterprise.EnterpriseType.MHA);
         person = enterprise.getPersonDirectory().addPerson();
        person.setlName("MHA Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("mha", "mha", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.HM);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setPersonsFirstName("MH");
        person.setlName("MH");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("hm", "hm", person, new HealthMinisterRole());
        account.setNetwork(network);
        account.setEnabled(true);
      
    return system;
    }
    
  
    
}
