/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfproject;
import javax.swing.JFileChooser;
import java.io.File;
/**
 *
 *
 */
public class GolfProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(fileChooser);
        League l = new League();
                //showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) 
        {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
//            selectedFile.getName();
            l.readWeeklyData(selectedFile.getName());
        }
        
        //l.readWeeklyData("write2.txt");
        
        l.writeLeagueData("new.txt");
    }
    
}
