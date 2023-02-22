/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.common.NeedService;

/**
 *
 * @author daniel
 */


public class NeedServiceRequest extends WorkRequest {
 
    
    private String requestId;
    private static int count = 000;
    private String helpDetails;
    private NeedService needService;
    private String requestResult;
   

    public NeedServiceRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("REQ");
        sb.append(count);
        requestId = sb.toString();
        count++;
    }
    
    public String getHelpDetails() {
        return helpDetails;
    }

    public void setHelpDetails(String helpDetails) {
        this.helpDetails = helpDetails;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setNeedHelp(NeedService needService) {
        this.needService = needService;
    }

    public NeedService getNeedHelp() {
        return needService;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public String getRequestResult() {
        return requestResult;
    }


    
    @Override
    public String toString() {
        return getNeedHelp().getService();
    }
    
    
    
    
}
