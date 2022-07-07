/**
 * Profile.java
 * @version 1.0.0
 * @author Amy Estep
 */

import java.util.ArrayList;

public class Profile {
    private String lastName;
    private String firstName;
    private int day;
    private int month;
    private int year;
    private String emailAddress;
    private String[] interests;
    private String[] groups;
    private ArrayList<Profile> friends = new ArrayList<Profile>();

    /**
     * creates Profile object
     * @param lastName the last name of the profile owner
     * @param firstName the first name of the profile owner
     * @param day the day that the profile owner was born
     * @param month the month that the profile owner was born
     * @param year the year that the profile owner was born
     * @param emailAddress the email of the profile owner
     * @param interests the interests of the profile owner
     * @param groups the groups that the profile owner is in
     */
    public Profile(String lastName, String firstName, int day, int month, int year, String emailAddress, String[] interests, String[] groups) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.emailAddress = emailAddress;
        this.interests = interests;
        this.groups = groups;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * @return firstName the first name of the profile
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * @return day+"-"+month+"-"+year the birthday of the profile
     */
    public String getDateOfBirth(){
        return day+"-"+month+"-"+year;
    }

    /**
     * @return emailAddress the email of the profile
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @return interests the interests of the profile
     */
    public String[] getInterests() {
        return interests;
    }

    /**
     * @return groups the groups of the profile
     */
    public String[] getGroups() {
        return groups;
    }
    
    public void insertFriend(Profile p){
        friends.add(p);
    }
    
    /**
     * @return friends.get(i) a certain friend of the profile
     */
    public Profile getFriend(int i){
        return friends.get(i);
    }
    
    /**
     * @return friends.size() the number of friends this profile has
     */
    public int numOfFriends(){
        return friends.size();
    }
    
    /**
     * @return String the last name, firstname, date of birth and email of this profile
     */
    @Override
    public String toString(){
        return this.getLastName()+", "+this.getFirstName()+", "+this.getDateOfBirth()+", "+this.getEmailAddress();
    }
         
}
