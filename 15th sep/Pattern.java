/*
Name - Shams Tabrej Khan
Program - Program to print pattern
Date - 15th Sep
*/

class Pattern
{
	
	static void firstPattern(int num)
	{
		
		for(int i=1; i<=num;i++)
		{
			System.out.println("*");
			
		}
		
	}
	
	static void secondPattern(int  numOfRows)
	{
		// printing numbers
		for(int i=1;i<=numOfRows;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + "*");
			}
		}
		
		
	}
	
	static void thirdPattern(int numofRows)
	{
		for(int i=1;i<=numOfRows;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
			  system.out.println(j + "*");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
  public static void main(String ... args)
  {
	
      int number =Integer.parseInt(args[0]);
	  //firstPattern(number);
	 //secondPattern(number);
	 thirdPattern(number);

	
  }
  



}