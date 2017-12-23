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
public class GolfTeam 
{
    private int teamID;
    private String teamName;
    private Golfer [] golfers;
    private int roundsWon;
    private int roundsLost;
    
    
    GolfTeam()
    {
        teamID = 0;
        teamName = "";
     //  golfers = new Golfer[5];
        roundsWon = 0;
        roundsLost = 0;
        golfers = new Golfer[5];
        for(int i = 0; i < 5; i++)
        {
             golfers[i] = new Golfer();
 
        }
    }
    
    GolfTeam(int teamsID, int rWon, int rLost, String teamsName)
    {
        teamID = teamsID;
        teamName = teamsName;
        roundsLost = rLost;
        roundsWon = rWon;
        golfers = new Golfer[5];
        for(int i = 0; i < 5; i++)
        {
             golfers[i] = new Golfer();
 
        }
    }

    /**
     * @return the teamID
     */
    public int getTeamID() {
        return teamID;
    }

    /**
     * @param teamID the teamID to set
     */
    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the golfers
     */
    public Golfer getGolfer(int index) {
       
       // Golfer golfer = new Golfer();        
        return golfers[index];
      //  System.out.println(golfer);
        
       // return golfers;
    }

    /**
     * @param golfer the golfers to set
     */
    public void setGolfer(int index, Golfer golfer) {
        //this.golfer = golfer;        

           golfers[index] = golfer;
    }

    /**
     * @return the roundsWon
     */
    public int getRoundsWon() {
        return roundsWon;
    }

    /**
     * @param roundsWon the roundsWon to set
     */
    public void setRoundsWon(int roundsWon) {
        this.roundsWon = roundsWon;
    }

    /**
     * @return the roundsLost
     */
    public int getRoundsLost() {
        return roundsLost;
    }

    /**
     * @param roundsLost the roundsLost to set
     */
    public void setRoundsLost(int roundsLost) {
        this.roundsLost = roundsLost;
    }
    
//    public String toString()
//    {
//        String str = "";
//        str =System.getProperty("line.separator")+ getTeamID()+System.getProperty("line.separator")+getTeamName()+System.getProperty("line.separator")+ getRoundsWon() +System.getProperty("line.separator")
//                + roundsLost+System.getProperty("line.separator");
//        return str;
//    }
    public String toString()
    {
        String str = "";
        str =System.getProperty("line.separator")+ getTeamID()+" "+ getRoundsWon()+" " + getRoundsLost()+" "+getTeamName();

        for(int i = 0; i < 5; i++)
        {
            str = str + System.getProperty("line.separator") + golfers[i].toString() ;
        }
        return str;
    }
}
