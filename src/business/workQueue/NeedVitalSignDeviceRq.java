/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

/**
 *
 * @author daniel
 */


public class NeedVitalSignDeviceRq extends WorkRequest{
    
    private String requestVSdeviceId;
    private static int count = 001;
    private String comments;
    private String reqResult;
    
    
    public NeedVitalSignDeviceRq()
    {
        
        StringBuffer sb = new StringBuffer();
        sb.append("SENSOR");
        sb.append(count);
        requestVSdeviceId = sb.toString();
        count++;
    }

    public String getRequestVSdeviceId() {
        return requestVSdeviceId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getdonationRequestResult() {
        return reqResult;
    }

    public void setdonationRequestResult(String requestResult) {
        this.reqResult = requestResult;
    }

    @Override
    public String toString() {
        return this.requestVSdeviceId;
    }
    
    
    
    
}
