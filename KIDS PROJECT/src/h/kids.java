package h;
import java.util.Scanner; 
import java.util.*;

// NAME: ATWIJUKA KEVIN
// REGNO: 2021/A/KIT/0748/F

/** The kid enters the name and the program counts the letters in the name or word 
 * 2021/A/KIT/0748/F
 * Atwijuka Kevin
 *BIT
 */


public class kids {}
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter YOUR NAME: ");  
String str= sc.nextLine();              //reads string   
System.out.print("YOUR NAME IS: "+str); 

      int count = 0;
     // System.out.println("String: "+str);
      for (int i = 0; i < str.length(); i++) {
         if (Character.isLetter(str.charAt(i)))
         count++;
      }
      System.out.println(" \n Number of letters in your name =  "+count );
    }


