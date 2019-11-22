package package3;

public class StringMethod5 
{

	public static void main(String[] args) 
	{
		String s ="this is my game. this is my rule";
		String s1="   my name is logi  ";
		
		String s2="I Am Villian";
		
		
	// string.toLowerCase() &&  string.toUpperCase()
		
		System.out.println("////string.toLowerCase() && string.toLowerCase()////");
		
		String lc=s2.toLowerCase();
		String uc=s2.toUpperCase();
		
		System.out.println(lc);
		System.out.println(uc);
		
	// string.split()
		
		System.out.println("/////////////////string.split()/////////////////////");	
		
		String[] word=s.split("\\s");
		
		System.out.println("word length is "+ word.length);
		for(String w: word)
		{
			System.out.println(w);
		}
		
		for(String w: s.split("\\s",0))
		{
			System.out.println(w);
		}
		
		for(String w: s.split("\\s",1))
		{
			System.out.println(w);
		}
		
		for(String w: s.split("\\s",2))
		{
			System.out.println(w);
		}
		
		for(String w: s.split("\\s",5))
		{
			System.out.println(w);
		}
		
		
	// string.trim()
		
		System.out.println("/////////////////string.trim()///////////////////////");	
		
		System.out.println(s1.length());
		
		String strr1=s1.trim();
		System.out.println(strr1);
		System.out.println(strr1.length());
		

    // string.replace() 	
			
		System.out.println("/////////////////string.replace()///////////////////");
		
		String str1=s.replace('s','z');
		String str2=s.replace("my","our");
		String str3=s.replace("\\s",""); // can't get desired output because of \\s
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
	// string.replaceAll() - accept only string args
				
		System.out.println("/////////////////string.replaceAll()///////////////////");
			
		String str4=s.replaceAll("s","z");    // character is not valid. so giving string syntax
		String str5=s.replaceAll("my","our");
		String str6=s.replaceAll("\\s","");
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		
	// string.join() 	
		
		System.out.println("/////////////////string.join()///////////////////////");	
		
		String st1=String.join("-","welcome","to","java","tutorial");
		String st2=String.join("/","21","10","1994");
		String st3=String.join(":","09","20","00");
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		
	}
	
}
