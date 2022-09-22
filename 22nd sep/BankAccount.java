/*
Program: written a program to display the account details
@author: Shams Tabrej khan
@Date: 22 sep 2022
*/


class BankAccount
{
   //declaring instance variable
	
	private int accNo;
	private String accName;
	private double accBalance;
	
	//default constructor
	
	BankAccount()
	{
		
	}
	
	//parametrized constructor
	
		BankAccount(int accNo,String accName,double accBalance)
		{
		   this.accNo = accNo;
		   this.accName = accName;
		   this.accBalance = accBalance;
		
	    }
		
		//Getters and setters
		
		       //get
		
		public int getAccNo()
	    {
		   return this.accNo;
	    }
		
		     //set
		
		public void setAccNo(int accNo)
	     {
		   
		   this.accNo=accNo;
	     }
		 
		 ///
		 
		 public String getAccName()
	   {
		   
		  return this.accName;
		
	   }
	   
	   public void setAccName(String accName)
	   
	  {
		  
		 this.accName=accName;
	  }
	  
	  ///
	  
	  public double getAccBalance()
	{
		return this.accBalance;
	}
	
	public void setAccBalance(double accBalance)
	{
		
		this.accBalance=accBalance;
	}
	  
	   




}