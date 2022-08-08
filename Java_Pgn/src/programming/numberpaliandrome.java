package programming;

public class numberpaliandrome {
	public static void main(String[] args) {
		int n=121;
		int copy=n;
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(copy==rev)
		{
			System.out.println("its a number paliandrome");
		
		}
		else
		{
			System.out.println("its not a number paliandrome");
		}

}

}
