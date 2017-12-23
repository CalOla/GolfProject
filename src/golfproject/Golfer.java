/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfproject;

/**
 *
 * 
 */
public class Golfer
{
    private int  golferID;
    private String firstName;
    private String lastName;
    private int totalRounds;
    private int totalStrokes;
    
    Golfer()
    {
        golferID = 0;
        firstName = "";
        lastName = "";
        totalRounds = 0;
        totalStrokes = 0;
    }
    
    Golfer(int golfersID, String fName, String lName, int tRounds, int tStrokes)
    {
        golferID = golfersID;
        firstName = fName;
        lastName = lName;
        totalRounds = tRounds;
        totalStrokes = tStrokes;    
    }

    /**
     * @return the golferID
     */
    public int getGolferID() {
        return golferID;
    }

    /**
     * @param golferID the golferID to set
     */
    public void setGolferID(int golferID) {
        this.golferID = golferID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the totalRounds
     */
    public int getTotalRounds() {
        return totalRounds;
    }

    /**
     * @param totalRounds the totalRounds to set
     */
    public void setTotalRounds(int totalRounds) {
        this.totalRounds = totalRounds;
    }

    /**
     * @return the totalStrokes
     */
    public int getTotalStrokes() {
        return totalStrokes;
    }

    /**
     * @param totalStrokes the totalStrokes to set
     */
    public void setTotalStrokes(int totalStrokes) {
        this.totalStrokes = totalStrokes;
    }

    /**
     * @return the average
     */
    public double getAverage() {
        double average = totalStrokes/totalRounds;
        return average;
    }
    
    public String toString()
    {
        String str = "";
        str = getGolferID()+System.getProperty("line.separator")+getFirstName()+System.getProperty("line.separator")+getLastName()
            + System.getProperty("line.separator") + getTotalRounds() +" "
                + getTotalStrokes();
        return str;
    }
}

