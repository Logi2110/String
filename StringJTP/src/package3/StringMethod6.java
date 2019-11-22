package package3;

public class StringMethod6
{
	public static void main(String[] args)
	{
		boolean b1=true,
				b2=false;
		char    ch='A';
		char[]  ca= {'L','O','G','I'};
		byte    by=15;
		short   sh=18;
		int     in=35;
		long    lo=66L;
		float   fl=18.9F;
		double  de=20.35638942;
		
		StringMethod6 obj=new StringMethod6();
		
		String s1=String.valueOf(b1);
		String s2=String.valueOf(b2);
		String s3=String.valueOf(ch);
		String s4=String.valueOf(ca);
		
		String s5=String.valueOf(by);
		String s6=String.valueOf(sh);
		String s7=String.valueOf(in);
		String s8=String.valueOf(lo);
		
		String s9=String.valueOf(fl);
		String s0=String.valueOf(de);
		
		String s11=String.valueOf(obj);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s0);
		
		System.out.println(obj);
		System.out.println(s11);
		
		
		
	}

}
