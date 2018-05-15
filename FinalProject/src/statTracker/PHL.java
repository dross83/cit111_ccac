/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statTracker;

/**
 *
 * @author dylan
 */
public class PHL {
    
    public static void main(String[] args){
        
        Player firstPlayer = new Player();
        
        firstPlayer.name = "Crosby";
        firstPlayer.gamesPlayed = 82;
        firstPlayer.goals = 29;
        firstPlayer.assists = 60;
        firstPlayer.pointsPerGameAvg = 9;
        
        Player secondPlayer = new Player();
        
        secondPlayer.name = "Malkin";
        secondPlayer.gamesPlayed = 78;
        secondPlayer.goals = 42;
        secondPlayer.assists = 56;
        secondPlayer.pointsPerGameAvg = 14;
        
        Player thirdPlayer = new Player();
        
        thirdPlayer.name = "Kessel";
        thirdPlayer.gamesPlayed = 82;
        thirdPlayer.goals = 34;
        thirdPlayer.assists = 58;
        thirdPlayer.pointsPerGameAvg = 12;
        
        System.out.println("---------------------------------------------------");
        System.out.println("****Retrieving Player Stats****");
        System.out.println("---------------------------------------------------");
        System.out.println("Player Name " + firstPlayer.name);
        System.out.println("Games Played " + firstPlayer.gamesPlayed);
        System.out.println("Goals Scored " + firstPlayer.goals);
        System.out.println("Assists Per Game " + firstPlayer.assists);
        System.out.println("Points Per Game Average " + firstPlayer.pointsPerGameAvg);
        
        System.out.println("---------------------------------------------------");
        System.out.println("****Retrieving Players Stats****");
        System.out.println("---------------------------------------------------");
        System.out.println("Player Name " + secondPlayer.name);
        System.out.println("Games Played " + secondPlayer.gamesPlayed);
        System.out.println("Goals Scored " + secondPlayer.goals);
        System.out.println("Assists Per Game " + secondPlayer.assists);
        System.out.println("Points Per Game Average " + secondPlayer.pointsPerGameAvg);
        
        System.out.println("---------------------------------------------------");
        System.out.println("****Retrieving Players Stats****");
        System.out.println("---------------------------------------------------");
        System.out.println("Player Name " + thirdPlayer.name);
        System.out.println("Games Played " + thirdPlayer.gamesPlayed);
        System.out.println("Goals Scored " + thirdPlayer.goals);
        System.out.println("Assists Per Game " + thirdPlayer.assists);
        System.out.println("Points Per Game Average " + thirdPlayer.pointsPerGameAvg);

    }
}
                
        
        
    
        

    
    
        
        
