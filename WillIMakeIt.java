/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;
/**
 *
 * @author dross83
 */
public class WillIMakeIt {
    
    public static void main (String[] args){
        //set final integer for miles per gallon
        final int MPG = 28;
        //declare variables
        double gasRemaining;
        double milesRemaining;
        //create scanner object
        Scanner scan = new Scanner(System.in);
        //prompt user for gas remainder input
        System.out.println("enter gallons of gas left in tank and press enter");
        //set scanner to recieve input
        gasRemaining = scan.nextDouble();
        //prompt user for miles remainder imput
        System.out.println("enter miles left to destination and press enter");
        //set scanner to recieve input
        milesRemaining = scan.nextDouble();
        //set if/else statement
        if (gasRemaining * MPG < milesRemaining){
            
            System.out.println("get ready to start walking");
            
        } else if (gasRemaining * MPG > milesRemaining) {
            System.out.println("you'll make it no problem");
            
        }//close else/if 
      }//close main
    }//close class 
    
        
                
        
    

