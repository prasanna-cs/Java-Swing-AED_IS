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

import java.util.ArrayList;


public class NeedService {
    
    
    
    private String service;
    private String serviceType;
    private String serviceDesc;
    private String serviceId;
    
    private String newService;
    
    private ArrayList<String> otherServiceList;
    
    private static int counter = 01;
    
    public NeedService()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("SERVICE");
        sb.append(counter);
        serviceId = sb.toString();
        counter++;
        
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    @Override
    public String toString() {
        return this.serviceId;
    }
    

    public ArrayList<String> getOtherServiceList() {
        return otherServiceList;
    }

    public String getNewService() {
        return newService;
    }

    public void setNewService(String newService) {
        this.newService = newService;
    }

    

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    
    
}
