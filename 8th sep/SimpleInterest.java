/*
Program: Calculate Simple Interest
@author: Shams Tabrej Khan
@Date: 8 sep 2022
*/


//declaring a class 
public class SimpleInterest
{
	//calling main 
    public static void main(String args[]) 
    {
        //Declare and Initialize the Principle, Rate and Time Period
        float P = 3500, R = 20, T = 6; 
        System.out.println("The entered principle amount is = " + P);
        System.out.println("The entered rate is = " + R);
        System.out.println("The entered time period is " + T);
  
        // Calculate simple interest 
        float SI = (P * T * R) / 100;
        //Print the simple interest 
        System.out.println("Simple interest = " + SI);  
    }
//end of main	
}
//end of class