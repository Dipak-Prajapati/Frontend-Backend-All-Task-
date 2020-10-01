package com.dips;
import java.util.Scanner; 

/**
 * Hello world!
 *@author DipS
 */
public class App { 
	/** 
	* This is a program for adding two numbers in java. 
	* @param args
	* Array Name  
	*/
    public static void main(String[] args) 
    { 
        /** 
        * This is the main method  
        * which is very important for  
        * execution for a java program. 
        */
  
        int x, y; 
        Scanner sc = new Scanner(System.in); 
        /** 
        * Declared two variables x and y.  
        * And taking input from the user  
        * by using Scanner class.  
        * 
        */
  
        x = sc.nextInt(); 
        y = sc.nextInt(); 
       
        int sum = sum(x,y); 
        System.out.println("Sum is: " + sum); 
    }
	/**
	*This is User Defined Method sum
	*@param x
	*Stored Integer value 
	*@param y
	*Stored Integer value 
	*/
    public static int sum(int x,int y)
    {
	/**
	*@return  
    	*Return Value
	*/
	return(x+y);
    } 
} 

