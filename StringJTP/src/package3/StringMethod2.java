package package3;

public class StringMethod2 
{

	public static void main(String[] args) 
	{
		String s ="Logesh logi",
				   s2="logi",
				   s3="Surya The Fire",
				   s4="";
		
	// String.isEmpty() return boolean output	
		
		System.out.println("////////////////string.isEmpty() //////////////////");
		
		if(s4.isEmpty())
			System.out.println("string s4 is empty");
		
		if(!s2.isEmpty())
			System.out.println("string s2 is not empty");

		
		
   // string.startsWith()
		
	
		System.out.println("/////////////////string.startWith()///////////////////");
		if(!s.startsWith("l"))
			System.out.println("string s not start with l");
	
		if(s.startsWith("L"))
			System.out.println("string s start with L");
		
		if(s.startsWith("Log"))
			System.out.println("string s start with Log");
		
		if(s.startsWith("sh ",4))
			System.out.println("string s start from 5th position with sh ");
		
		
	// string.endsWith
		
		
		System.out.println("/////////////////string.endWith()///////////////////");
		if(!s3.endsWith("E"))
			System.out.println("string s3 not end with E");
	
		if(s3.endsWith("e"))
			System.out.println("string s3 end with e");
		
		if(s3.endsWith("Fire"))
			System.out.println("string s3 end with Fire");
		
	}

}
