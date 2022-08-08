package Pgm_30;

public class PalindromeStringTest {
public static void main(String[] args) {
	String s="moom";
	String rev="";
	
	for(int i=s.length()-1;i>= 0;i--)
	{
		rev=rev+s.charAt(i);
	}
	
	if(rev.equalsIgnoreCase(s))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
	
	
	
}
}
