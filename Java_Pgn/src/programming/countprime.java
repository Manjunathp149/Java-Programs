package programming;

public class countprime {
	public static void main(String[] args) {
		for(int j=2;j<=10;j++)
		{
			int no=j;
			boolean flag=true;
			int count=0;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
				flag=false;
				}
			}
			if(flag==true)
			{
				count++;
			}
			System.out.println(count);
		}
	}

}
