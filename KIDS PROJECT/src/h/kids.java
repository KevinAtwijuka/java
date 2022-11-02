package h;
import java.util.Scanner; 
import java.util.*;

// NAME: ATWIJUKA KEVIN
// REGNO: 2021/A/KIT/0748/F

/** The kid enters the name and the program counts the letters in the name or word 
 * 2021/A/KIT/2021/F
 * Atwijuka Kevin
 *BIT
 */

public class kids {
	class Main {
	  public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter Full Name:");

	    String x = myObj.nextLine();  
	    System.out.println("Full Name is " + x);  	    
	    String string = "The best of both worlds";    
	        int count = 0;    
	            

 
	        for(int i = 0; i < x.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count++;    
	        }    
	            
	         
	        System.out.println("Total number of characters in a string: " + count);    
	        
	  }
	}

	}


