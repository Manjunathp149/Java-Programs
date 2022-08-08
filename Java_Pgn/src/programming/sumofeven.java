package programming;

import java.util.Scanner;

class sumofeven
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
	findsumofevendigits(x);
	}
static void findsumofevendigits(int no)
{
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		if(rem%2==0)
		{
			sum+=rem;
		}
		no=no/10;
	}
	System.out.println(sum);
}
}
