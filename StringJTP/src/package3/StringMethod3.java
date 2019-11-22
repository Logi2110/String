package package3;

public class StringMethod3 
{

	public static void main(String[] args) 
	{
		String s ="Logesh",
				   s2="logi",
				   s3="Surya The Fire";
		
		char[] ch;
		char[] sChar=new char[10];
		                      
		byte[] by;
		
		
	// string.toCharArray()	

		ch=s3.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	// string.getBytes()
		
		by=s2.getBytes();
		
		for(int i=0;i<by.length;i++)
		{
			System.out.println(by[i]);
		}
		
	// string.getChars()
		
		try 
		{
			s.getChars(0,6,sChar,0);
		}catch(Exception ex){System.out.println(ex);} 
		
		System.out.println(sChar.length);
		
		for(int i=0;i<6;i++)
		{
			System.out.print(sChar[i]);
		}
	
		
		try 
		{
			s2.getChars(0,4,sChar,6);
		}catch(Exception ex){System.out.println(ex);} 
		

		for(int i=0;i<sChar.length;i++)
		{
			System.out.print(sChar[i]);
		}
		

	
	}
	
	

}
