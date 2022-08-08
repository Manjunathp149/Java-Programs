package Pgm_30;

public class PalindromeNumberTest {

	
	public static void main(String[] args) {
		
		int num=1221;
		int rev=0;
		int num1=num;
		while(num>0)
		{
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		if(rev==num1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
	}
}
