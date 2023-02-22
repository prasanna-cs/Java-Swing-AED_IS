/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.common.NeedService;
import business.network.Network;
import business.organizations.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author riaka
 */


public class EcoSystem extends Organization{
 
   private ArrayList<Network> networkList;
   private static EcoSystem ecoSystem;
   private ArrayList<NeedService> serviceList;
    
   public EcoSystem()
   {
       super(null);
       networkList = new ArrayList<>();
       serviceList = new ArrayList<>();
      
   }
   
   public static EcoSystem getInstance()
   {
    if(ecoSystem == null)
    {
      ecoSystem = new EcoSystem();
    }
    return ecoSystem;
   }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
   
    public Network addNetwork()
    {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkIfUsernameIsUnique(String username)
    {
      if (!getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
        return false;
      }
      return true;
    }
   
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }
   
   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
   
    public NeedService addNeedService()
    {
        NeedService needService = new NeedService();
        serviceList.add(needService);
        return needService;
    }
    
    public void deleteService(NeedService needService)
    {
        serviceList.remove(needService);
    }

    public ArrayList<NeedService> getServiceList() {
        return serviceList;
    }
    
    
    
}
