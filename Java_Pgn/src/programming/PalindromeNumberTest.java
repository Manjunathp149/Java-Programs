package programming;

public class PalindromeNumberTest {

	
	public static void main (String[]args)
	{
	int num=1224;
	int rev=0;
	int num1=num;

	while(num>0)
	{
	rev=(rev*10)+(num%10);
	num=num/10;
	}
	if(num1==rev)
	{
	System.out.println("The given number is a palindrome");
	}
	else
	{
	System.out.println("The given number is not a palindrome");
	}
	}
}
