/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.vsTrackingDevice;

import java.util.ArrayList;

/**
 *
 * @author prasanna
 */


public class vsTrackingDevice {
    
    private String deviceName;
    private String deviceId;
    private vsDeviceMeasurements vsDeviceMeasurements;
    private ArrayList<vsDeviceMeasurements> measurementList;
    
    public vsTrackingDevice()
    {
        this.vsDeviceMeasurements = new vsDeviceMeasurements();
        measurementList= new ArrayList<>();
    }
    
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public vsDeviceMeasurements getVsDeviceMeasurements() {
        return vsDeviceMeasurements;
    }

    
    @Override
    public String toString() {
        return this.deviceName;
    }
    
    
    
}
