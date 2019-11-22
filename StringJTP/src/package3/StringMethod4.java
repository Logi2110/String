package package3;

public class StringMethod4 
{

	public static void main(String[] args)
	{
		String s ="Logesh",
				   s2="logi",
				   s3="Surya The Fire",
				   s4="",
				   s5="logi",
				   s6="gopi",
				   s7="sharath",
				   s8="LoGi",
				   s9="logesh logi";
		           
		
	// string.concat()
		
		System.out.println("/////////////////string.concat()///////////////////");
		
		s.concat(s2);
		System.out.println(s);
		
		s=s.concat(s2);
		System.out.println(s);
		
		
		s=s.concat(" ").concat(s3).concat(" ").concat(s2);
		System.out.println(s);
		
				
	// string.compareTo()
		
		System.out.println("/////////////////string.compareTo()///////////////////");
		
		int i=s2.compareTo(s5);  // i=0
		int j=s2.compareTo(s6);  // j=5
		int k=s2.compareTo(s3);  // k=108(l)-83(S) =25
		int l=s2.compareTo(s7);  // l=108(l)-115(s)=-7
		
		int m=s2.compareTo(s4);  // when compare empty string, return length of the string 
		int n=s4.compareTo(s2); 
		System.out.println(i+"\n"+j+"\n"+k+"\n"+l+"\n"+m+"\n"+n);
		
	    
	// String.contains() 

        System.out.println("/////////////////string.contains()///////////////////");
       
        if(s9.contains(s2))
			System.out.println("string s9 contains s2");
       
	    if(s9.contains(s4))
			System.out.println("string s9 contains s4");
		
		if(!s9.contains(s8))
			System.out.println("string s9 is not contains s8");
		
	
	// string.equals()
       
        System.out.println("/////////////////string.equals()///////////////////");
		
		if(s2.equals(s5))
			System.out.println("string s2 is equal to s5");

		if(!s2.equals(s6))
			System.out.println("string s2 is not equal to s6");
		

	// string.equalsIgnoreCase()
		
		System.out.println("/////////////////string.equalsIgnoreCase()///////////////////");
			
		if(s2.equalsIgnoreCase(s8))
			System.out.println("string s2 is equal to s8 when ignore case");
		
	}

}
