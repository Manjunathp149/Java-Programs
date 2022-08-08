package String;

public class StringPalindromeTest {

	public static void main(String[] arsg)
	{
	String s="mom";
	String rev="";
	

	for(int i=s.length()-1;i>=0;i--)
	{
	rev=rev+s.charAt(i);
	}
	if(s.equalsIgnoreCase(rev))
	{
	System.out.println("The String is a palindrome");
	}
	else
	{
	System.out.println("The string is not a palindrome");
	}
	}
}
