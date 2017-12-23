/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * 
 */
public class League
{
    private String leagueName;
    private int numTeams;
    private GolfTeam [] teams;
    private int numWeeks;
    private Scanner input;
    
    League()
    {
        leagueName = "";
        numTeams = 0;
       teams = new GolfTeam [numTeams];
        numWeeks = 0;
        
//        GolfTeam gTeam;
        for(int i = 0; i < numTeams; i++)
        {
            
            teams[i]  = new GolfTeam ();
            
            
        }
    }
    
    League(String leagueNames, int numTeam, int numWeek)
    {
        leagueName = leagueNames;
        numTeams = numTeam;
        numWeeks = numWeek;
       teams = new GolfTeam [numTeams];
        for(int i = 0; i < numTeams; i++)
        {
            
            teams[i]  = new GolfTeam();
            
            
        }
        
    }

    /**
     * @return the leagueName
     */
    public String getLeagueName() {
        return leagueName;
    }

    /**
     * @param leagueName the leagueName to set
     */
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    /**
     * @return the numTeams
     */
    public int getNumTeams() {
        return numTeams;
    }

    /**
     * @param numTeams the numTeams to set
     */
    public void setNumTeams(int numTeams) {
        this.numTeams = numTeams;
        teams = new GolfTeam [numTeams];
        for(int i = 0; i < numTeams; i++)
        {
            teams[i]  = new GolfTeam();
        }
    }

    /**
     * @return the teams
     */
    public GolfTeam getTeams(int index) {
        
        
        return teams[index];
    }

    /**
     * @param teams the teams to set
     */
    public void setTeams(int index, GolfTeam gTeam) {
          
          teams[index] = gTeam;
    }

    /**
     * @return the numWeeks
     */
    public int getNumWeeks() {
        return numWeeks;
    }

    /**
     * @param numWeeks the numWeeks to set
     */
    public void setNumWeeks(int numWeeks) {
        this.numWeeks = numWeeks;
    }
    
    public void readWeeklyData(String wklyFileName)
    {
         try
        {
            input = new Scanner(new File(wklyFileName));
            
        }
        catch(FileNotFoundException fileNotFoundException)
       {
           System.out.println("File Not found");
           System.exit(1);
       }
         
       leagueName = input.nextLine();
       numTeams = Integer.parseInt(input.next());
       numWeeks = Integer.parseInt(input.next());

        setLeagueName(leagueName);
        setNumTeams(numTeams);
        setNumWeeks(numWeeks);
       
       int golferID  = 0;
       String fname = "";
       String lname = "";
       int ts  = 0;
       int tr  = 0;
       
       int teamID  = 0;
       String tname = "";
       int rwon  = 0;
       int rlost  = 0;
       int j = 0;
      // j = numTeams;
       while(j < numTeams)
       {
           
           GolfTeam gt = new GolfTeam(Integer.parseInt(input.next()),Integer.parseInt(input.next()), Integer.parseInt(input.next()),input.nextLine());

           
           
           for(int i = 0; i < 5; i++)
           {
                Golfer golfer = new Golfer(Integer.parseInt(input.nextLine()),input.nextLine(),input.nextLine(),Integer.parseInt(input.next()),Integer.parseInt(input.next()));
                input.nextLine();

                gt.setGolfer(i, golfer);
       
           }
  
            setTeams(j, gt);
            j++;
       }
       
       
    }
       public void writeLeagueData(String outputFileName)
    {
        try
        {
            PrintWriter output  = null;
            output = new PrintWriter(new FileOutputStream(outputFileName,false));
            
            output.println(leagueName); 
            output.print(numTeams + " " + numWeeks);

            for(GolfTeam team : teams)
            {
                output.print(team.toString());       
            }
            output.println(""); 
            output.close();
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            System.out.println("Error opening output file");
        }
    }
    
    public String toString()
    {
        
        String str = "";
        for(GolfTeam team : teams)
        {
            str += System.getProperty("line.separator") + team.toString() +
                   System.getProperty("line.separator");
            
        }
        return str;
    }
}
