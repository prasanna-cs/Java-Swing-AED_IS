/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person;

/**
 *
 * @author daniel
 */


public class Feedback {
    
    private static int count=0;
    private int feedbackID;
    private String feedbackMessage;
    private String writerName;
    private String date;
    
    public Feedback()
    {
        count++;
       feedbackID = count;
    }

    public int getFeedbackID() {
        return feedbackID;
    }


    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public void setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.valueOf(this.feedbackID);
    }
    
    
    
}
