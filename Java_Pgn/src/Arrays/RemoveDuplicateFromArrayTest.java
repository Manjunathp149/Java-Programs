package Arrays;

public class RemoveDuplicateFromArrayTest {

	public static void main(String[] args) {
		
		int[] a={1,2,5,3,5};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			if(count==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	
}
