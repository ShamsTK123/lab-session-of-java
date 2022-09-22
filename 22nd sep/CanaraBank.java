class CanaraBank
{
   public static void main(String ...args)
   {
	   BankAccount acc1= new BankAccount(1234,"Rahul Kumar",60000.0);
	   BankAccount acc2= new BankAccount(2222,"Shams Tabrej",920880.0);
	   
	   
	   System.out.println("Account No:  "+acc1.getAccNo()+"   Name:   "+acc1.getAccName()+"  Balance:  "+acc1.getAccBalance());
	   System.out.println("Account No:  "+acc2.getAccNo()+"   Name:   "+acc2.getAccName()+"  Balance:  "+acc2.getAccBalance());
	   
	   //declaring the objects
		BankAccount acc3= new BankAccount();
		
		
		//setting the values of the object
		acc3.setAccNo(3333);
		acc3.setAccName("Krishna Yadav");
		acc3.setAccBalance(78645.98);
		
		
				
		System.out.println("Account No:  "+acc3.getAccNo()+"   Name:   "+acc3.getAccName()+"  Balance:  "+acc3.getAccBalance());




   }
   


}