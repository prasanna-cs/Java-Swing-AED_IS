/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.person.Person;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */


public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountDirectory;
    
    public UserAccountDirectory()
    {
      userAccountDirectory = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountDirectory)
            if (ua.getuName().equals(username) && ua.getUserAccountpassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount addUserAccount(String username, String password, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setuName(username);
        userAccount.setUserAccountpassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountDirectory.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        boolean flag = true;
        for (UserAccount ua : userAccountDirectory){
            if (ua.getuName().equals(username))
            {
              flag =  false;
            }
            else
            {
            flag =  true;
            }
        }
        return flag;
    }
    
    public void deleteUserAccount(UserAccount userAccount)
    {
        userAccountDirectory.remove(userAccount);
    }
    
}
