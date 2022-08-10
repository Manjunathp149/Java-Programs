package wed;

public class AdditionOfTwoArraysTest {

	
	public static void main(String[] args) {
		int[] a={1,2,5,4,5,5,9,7,6};
		int[] b={2,5,6,7,8};
		
		int count=a.length;
		if(b.length>a.length)
		{
			count=b.length;
		}
		for (int i = 0; i <count; i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			} catch (Exception e) {
				if(b.length>a.length)
				{
					System.out.print(b[i]+" ");
				}
				else
				{
					System.out.print(a[i]+" ");
				}
			}
			
			
		}
	}
}
