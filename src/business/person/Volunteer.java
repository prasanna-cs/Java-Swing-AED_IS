/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */


public class Volunteer extends Person{
 
    private String volunteerId;
    private static int counter = 001;
    private String latitiude;
    private String longitude;
    private ArrayList<Feedback> feedbackList;
    
    
    public Volunteer()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("VOL");
        sb.append(counter);
        volunteerId = sb.toString();
        counter++;
        feedbackList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.getFullName();
    }

  
    public String getVolunteerId() {
        return volunteerId;
    }

    public String getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(String latitiude) {
        this.latitiude = latitiude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Feedback> getFeedbackList() {
        return feedbackList;
    }

   
    public Feedback addTestimonial()
    {
        Feedback feedback = new Feedback();
        feedbackList.add(feedback);
        return feedback;
    }
    
   
}
