package Pgm_30;

public class SeparateAllTest {
public static void main(String[] args) {
	
	String s="manjunathp149@gmail.com";
	String ch="";
	String num="";
			String sp="";
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			num=num+s.charAt(i);
		}
		else if(s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			ch=ch+s.charAt(i);
		}
		else
		{
			sp=sp+s.charAt(i);
		}
	}
	System.out.println(num);
	System.out.println(ch);
	System.out.println(sp);
}
}
