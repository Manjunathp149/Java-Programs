package Pgm_30;

public class CheckNumberPrimeOrNoTest {
public static void main(String[] args) {
	int num=11; //Mention the number
	int count=0;
	
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}
	if(count==0)
	{
		System.out.println("Prime number");
	}
	else
	{
		System.out.println("Not Prime Number");
	}
	
}
}
