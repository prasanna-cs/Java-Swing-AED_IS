/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.network.Network;
import business.person.Person;
import business.role.Role;
import business.workQueue.WorkQueue;

/**
 *
 * @author daniel
 */



public class UserAccount {
    
    private String uName;
    private String userAccountpassword;
    private Person person; 
    private Role role;
    private WorkQueue workQueue;
    private boolean enabled = true;
    private Network network;
   
    
    public UserAccount() {
        workQueue = new WorkQueue();
    }
  
    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getUserAccountpassword() {
        return userAccountpassword;
    }

    public void setUserAccountpassword(String userAccountpassword) {
        this.userAccountpassword = userAccountpassword;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return uName; //To change body of generated methods, choose Tools | Templates.
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Network getNetwork() {
        return network;
    }

    
    
    
}
