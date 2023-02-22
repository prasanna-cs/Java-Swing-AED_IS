/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizations;

import business.organizations.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationDirectory;
    
    public OrganizationDirectory()
    {
      organizationDirectory = new ArrayList<>();
    }
    
    public Organization addOrganization(Type type)
    {
       Organization organization = null;
        if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organizationDirectory.add(organization);
        }
        else if (type.getValue().equals(Type.SupportSeeker.getValue())){
            organization = new ServiceSeekerOrganization();
            organizationDirectory.add(organization);
        }
        else if (type.getValue().equals(Type.Supervisor.getValue())){
            organization = new SupervisorOrganization();
            organizationDirectory.add(organization);
        }
         else if (type.getValue().equals(Type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationDirectory.add(organization);
        }
         else if (type.getValue().equals(Type.Transport.getValue())){
            organization = new TransportOrganization();
            organizationDirectory.add(organization);
        }
          else if (type.getValue().equals(Type.HM.getValue())){
            organization = new HealthMinistryOrganization();
            organizationDirectory.add(organization);
        }
           else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationDirectory.add(organization);
        }
        return organization;
    }

    public ArrayList<Organization> getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public void deleteOrganization(Organization organization)
    {
      organizationDirectory.remove(organization);
    }
    
}
