/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_methods;

import java.util.Scanner;

/**
 *
 * @author dross83
 */
public class ChooseYourAdventure {
    
    public static void main(String[] args) {
           
            String jungleCamp;
           
            System.out.println("Welcome... to the Jungle! " + "We've got fun and games!");
            System.out.println("                                                       ");
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("You find yourself hiking deep in the jungle ");
            System.out.println("when suddenly the trail forks up ahead");
            System.out.println("do you go (left), (right), or (back)?");
            
            jungleCamp = input.next();
            
            String lcJungleCamp = jungleCamp.toLowerCase();
            
            switch(lcJungleCamp){
                case "back":
                    turnBack();
                    break;
                case "left":
                    turnLeft();
                    break;
                case "right":
                    turnRight();
                    break;
                
            }//close switch
            
    }//close main method
    public static void turnLeft() {
        String fight;
        
        System.out.println("You chose to go left... How adventurous of you");
        System.out.println("Unfortunately left leads to a dead end... And a Jaguar");
        System.out.println("Do you (fight) or (flee)?");
        
        Scanner input = new Scanner(System.in);
        
        fight = input.next();
        
        String lcFight = fight.toLowerCase();
        
        switch(fight){
            case "flee":
                turnBack();
                break;
            case "fight":
                turnRight();
                break;
        }//close turnLeft switch
    }//close turnLeft method
    public static void turnRight() {
        String escape;
        
        System.out.println("You ended up right... Sometimes right is actualy wrong");
        System.out.println("In this case it's super wrong as you encounter the Wacka Flacka tribe");
        System.out.println("Do you (run) or (stay)?");
        
        Scanner input = new Scanner(System.in);
        
        escape = input.next();
       
        String lcEscape = escape.toLowerCase();
        
        switch(escape){
            case "stay":
                turnBack();
                break;
            case "run":
                turnLeft();
                break;
        }//close turnRight switch
    }//close turnRight method    
    public static void turnBack() {
        
        String retreat;
        
        System.out.println("You ended up back at camp... which has been takin over by the GoochiGang");
        System.out.println("The gang wants you to join...");
        System.out.println("Do you join and (trap) or do you (front)?");
        
        Scanner input = new Scanner(System.in);
        
        retreat = input.next();
        
        String lcRetreat = retreat.toLowerCase();
        
        switch(retreat){
            case "front":
                turnLeft();
                break;
            case "trap":
                turnRight();
                break;
        }//close retreat switch
    }//close turnBack method
}//close class
        
        
        
        
