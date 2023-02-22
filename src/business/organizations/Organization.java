/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organizations;

import business.person.PersonDirectory;
import business.role.Role;
import business.userAccount.UserAccountDirectory;
import business.workQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */



public abstract class Organization {
    
    private String organizationName;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private WorkQueue workQueue;
    private int organizationId;
    private static int counter = 000;

    public Organization(String organizationName) {
    this.organizationName = organizationName;
    userAccountDirectory = new UserAccountDirectory();
    personDirectory = new PersonDirectory();
    workQueue = new WorkQueue();
    counter++;
    organizationId = counter;
    }
    
    public enum Type
    {
     Admin("Admin"),
     Volunteer("Volunteer Organization"),
     SupportSeeker("SupportSeeker Organization"),
     Supervisor("Supervisor Organization"),
     Donor("Donor Organization"),
     Transport("Transport Organization"),
     HM("HM Organization"),
     Doctor("Doctor Organization");
     
     private String value;
     
     private Type(String value)
     {
         this.value = value;
     }

        public String getValue() {
            return value;
        }
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getOrganizationName() {
        return organizationName;
    }
    
     public abstract ArrayList<Role> getSupportedRole();

    public int getOrganizationId() {
        return organizationId;
    }

    @Override
    public String toString() {
        return this.organizationName;
    }
    
    
}
