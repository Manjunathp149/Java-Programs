package programming;

public class prime {
	public static void main(String[] args) {
		int no=8 ;
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("its a prime no");
		}
		else
		{
			System.out.println("its not a prime no");
		}
	}

}
