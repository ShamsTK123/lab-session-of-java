 /*
Name - Shams Tabrej Khan
Date - 15 sep
Program - Print Tagline of Company
*/ 
class Brand
{
	static void BrandName()
	{
		String tagline = "Adidas"; //Putting Brand Name
		switch (tagline)
		{
			case "Adidas" : System.out.println ("Impossible is Nothing");
				break;
			case "Nike" :System.out.println ("Just Do It");
				break;
			case "Reebok" : System.out.println("I am what I am");
				break;
			case "Puma" : System.out.println ("FOREVER FASTER IS ALWAYS FIRST, NEVER SECOND, NEVER THIRD");
				break;
			case "Sketchers" : System.out.println ("Comfort and bounce in every step");
				break;
		}
	}
	public static void main (String args[])
	{
		BrandName();
	}
}	