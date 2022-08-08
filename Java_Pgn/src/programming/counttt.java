package programming;

public class counttt {
	public static void main(String[] args) {
		int n=102511;
		int count=0;
		while((n!=0))
		{
			int m=n%10;
			if(m==1 || m!=0)
			{
				count++;
			}
			n=n/10;
			
		}
		System.out.println(count);
	}

}
