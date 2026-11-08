package Lab2_Tamana;
import java.security.SecureRandom;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SecureRandom random = new SecureRandom();
		  // Roll the first 4 dice
		 int die1 = random.nextInt(6) + 1;
	        int die2 = random.nextInt(6) + 1;
	        int die3 = random.nextInt(6) + 1;
	        int die4 = random.nextInt(6) + 1;
	        
	        int sum = die1 + die2 + die3 + die4;
       
	        System.out.println("Die 1: " + die1);
	        System.out.println("Die 2: " + die2);
	        System.out.println("Die 3: " + die3);
	        System.out.println("Die 4: " + die4);
	        System.out.println("Total: " + sum);
       
	        if (sum == 7 || sum == 11 || sum == 15 || sum == 21) {

	            System.out.println("You win!");
            
	        } else if (sum == 10 || sum == 12 || sum == 13 ||
	                sum == 19 || sum == 20 || sum == 22 ||
	                sum == 23 || sum == 24) {

	            System.out.println("You lose!");
	           
	        } else {
	            
	            int goal = sum;

	            System.out.println("Your goal number is: " + goal);
	            System.out.println("Roll the four dice again.");
	            System.out.println();
	            
	            System.out.println("Second Roll:");
	            
	            die1 = random.nextInt(6) + 1;
	            die2 = random.nextInt(6) + 1;
	            die3 = random.nextInt(6) + 1;
	            die4 = random.nextInt(6) + 1;

	            int newSum = die1 + die2 + die3 + die4;
	            
	            System.out.println("Die 1: " + die1);
	            System.out.println("Die 2: " + die2);
	            System.out.println("Die 3: " + die3);
	            System.out.println("Die 4: " + die4);
	            System.out.println("Total: " + newSum);
	            if (newSum == goal) {

	                System.out.println("You rolled the goal number. You win!");

	            } else {

	                System.out.println("You did not roll the goal number. You lose!");
	            }
	            }
	        }
	    
		

	}


