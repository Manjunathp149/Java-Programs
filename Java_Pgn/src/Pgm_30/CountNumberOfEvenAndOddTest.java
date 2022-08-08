package Pgm_30;

public class CountNumberOfEvenAndOddTest {
public static void main(String[] args) {
	
	int num=12334;
	int even_count=0;
	int Odd_count=0;
	
	while(num>0)
	{
		num=num/10;
		if(num%2==0)
		{
			even_count++;
		}
		else
		{
			Odd_count++;
		}
	}
	System.out.println(even_count);
	System.out.println(Odd_count);
	
}
}
