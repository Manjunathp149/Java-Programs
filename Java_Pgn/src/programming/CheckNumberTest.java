package programming;

import java.util.Scanner;

public class CheckNumberTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		
		
		if(num%3==0 && num%5==0)
		{
			System.out.println("Hi");
		}
		else if(num%5==0)
		{
			System.out.println("Hello");
		}
		else if (num%3==0)
		{
			System.out.println("Bye");
		}
		else{
			System.out.println("Bye Bye");
		}
	}
}
