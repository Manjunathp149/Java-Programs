package String;

public class Segregatealpnumchartest {

	
	public static void main(String[] args)
	{
	String s="Himanjunath149@gmail.com";
	String al="";
	String num="";
	String character="";

	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
	{
	al=al+s.charAt(i);
	}
	else if(s.charAt(i)>='0' && s.charAt(i)<='9')
	{
	num=num+s.charAt(i);
	}
	else
	{
		character=character+s.charAt(i);
	}
	}
	System.out.println(al+" "+num+" "+character);
	
	}
}
