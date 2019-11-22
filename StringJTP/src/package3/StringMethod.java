package package3;

public class StringMethod 
{

	public static void main(String[] args)
	{
		String s ="Logesh",
			   s2="logi",
			   s3="Surya The Fire",
			   s4="",
			   s5="this is my game";
			   
		char ch;
		
		int i=2;
		
	// string.length() 	
		
		System.out.println("/////////////////string.length()///////////////////");
		System.out.println("Logesh length is "+ s.length());
		System.out.println("Empty string length is "+ s4.length());
		
		
	// string.indexOf()
		
		System.out.println("/////////////////string.indexOf()///////////////////");
		
		int index1=s3.indexOf('r');
		int index2=s3.indexOf('r',2);    // starting point of index
		int index3=s3.indexOf('r',3);
		int index4=s3.indexOf('z');
		
		int index5=s5.indexOf("is");
		int index6=s5.indexOf("is",2);
		int index7=s5.indexOf("is",3);
		int index8=s5.indexOf("the");
		
		System.out.println(index1+" "+index2+" "+index3+" "+index4);
		System.out.println(index5+" "+index6+" "+index7+" "+index8);
		

	// string.lastIndexOf()
			
		System.out.println("/////////////////string.lastIndexOf()///////////////////");
			
			int ind1=s3.lastIndexOf('r');
			int ind2=s3.lastIndexOf('r',12);
			int ind3=s3.lastIndexOf('r',11);
			int ind4=s3.lastIndexOf('z');
			
			int ind5=s5.lastIndexOf("is");
			int ind6=s5.lastIndexOf("is",5);
			int ind7=s5.lastIndexOf("is",4);
			int ind8=s5.lastIndexOf("the");
			
			System.out.println(ind1+" "+ind2+" "+ind3+" "+ind4);
			System.out.println(ind5+" "+ind6+" "+ind7+" "+ind8);	
			
		
	// string.charAt(index)	
		
		System.out.println("/////////////////string.charAt()///////////////////");
		
		ch=s.charAt(i);
		System.out.println(ch);
		
		for(i=0;i<s2.length();i++)
		{
			System.out.print(s2.charAt(i));
		}
		
		
	// string.substring()
		
		System.out.println("\n"+"/////////////////string.substring()///////////////////");
		System.out.println(s3.substring(6,9));
		System.out.println(s3.substring(6));
		
		
	}

}
