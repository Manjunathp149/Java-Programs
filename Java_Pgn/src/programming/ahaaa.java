package programming;
public class ahaaa {
	public static void main(String[] args) {
		int n=3;
		boolean flag=true;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Its prime no");
		}
		else if(flag==false)
		{
			System.out.println("Its not prime no");
		}
	}
	}
	
