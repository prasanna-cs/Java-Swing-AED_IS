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


public class PersonDirectory {
    
      private ArrayList<Volunteer> volunteerDirectory;
      private ArrayList<ServiceSeeker> customerDirectory;
      private ArrayList<Person> personDirectory;
    
      public PersonDirectory()
      {
            volunteerDirectory = new ArrayList<>();
            customerDirectory = new ArrayList<>();
            personDirectory = new ArrayList<>();
      }
      
      public Volunteer addVolunteer()
    {
        Volunteer volunteer = new Volunteer();
        volunteerDirectory.add(volunteer);
        return volunteer;
    }
    
    public void removeVolunteer(Volunteer volunteer)
    {
      volunteerDirectory.remove(volunteer);
    }
    
    public ServiceSeeker addCustomer()
    {
        ServiceSeeker customer = new ServiceSeeker();
        customerDirectory.add(customer);
        return customer;
    }
    
    public void removeCustomer(ServiceSeeker customer)
    {
        customerDirectory.remove(customer);
    }
    

    public ArrayList<ServiceSeeker> getCustomerDirectory() {
        return customerDirectory;
    }

    public ArrayList<Volunteer> getVolunteerDirectory() {
        return volunteerDirectory;
    }


      public Person addPerson()
    {
        Person person = new Person();
       personDirectory.add(person);
        return person;
    }
    
    public void removePerson(Person person)
    {
        personDirectory.remove(person);
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

  
    

}
