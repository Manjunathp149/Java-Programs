package Pgm_30;

public class PrintEvenOddNumberInArrayTerst {
public static void main(String[] args) {
	int[] a={2,4,61,12,1,5,8,4,6,8};
	
	System.out.println("The even number are:");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.print(a[i]+" ");
		}
	}
	System.out.println();
	System.out.println("The odd number are:");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.print(a[i]+" ");
		}
	}
}
}
