/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
//import scanner
import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class MathTest {
//open main method    
    public static void main(String[] args) {
//declare your variable variables
        int correctAnswer = 25;
        int studentAnswer;
        int numLoops = 0;
//welcome Yinzer and explain rules
        System.out.println("Welcome to... " + "Who Wants To Be a High School Grad!");
        
        System.out.println("You have 3 attempts to answer correctly in order to receive your diplomat");
//set up scanner for user input N'at
        Scanner input = new Scanner(System.in);
//set up while loop for math question        
    while(numLoops < 3){
        
        System.out.println("What is 25+25-25?");
        
        studentAnswer = input.nextInt();
//set up if statement with break for correct answer        
    if(studentAnswer == correctAnswer){
        
        System.out.println("Fantastic work student! The education system has clearly not failed you!");
        break;
//set else statement for incorrect answer    
    }else{
        System.out.println("uh oh... try to try harder please... your schools funding depends on it!");
//set numLoop counter     
            numLoops = numLoops + 1;
      
        }//close else
      
      }//close while
//set additional if statement for 3 incorrect answer closeout... just for fun    
    if(numLoops == 3){
    
        System.out.println("Well... obviously there's a problem here but rather than address it we're just going to close down your school");
        
        System.out.println("Good luck to you in the real world where 25+25-25 actually equals unemployment");
        
    }//close second if
    
  }//close main

}//close class
    
      
