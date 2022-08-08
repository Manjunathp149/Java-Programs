package programming;

public class sumofsqures {
	public static void main(String[] args) {
		int n=145;
		int copy=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int m=rem;
			int fact=1;
			for(int i=m;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
					n=n/10;
		}
		if(sum==copy)
		{
			System.out.println("its a strongno");
		}
		else
		{
			System.out.println("its a not strongno");
	
		}
	}

}
