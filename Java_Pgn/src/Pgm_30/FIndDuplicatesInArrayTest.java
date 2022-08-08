package Pgm_30;

public class FIndDuplicatesInArrayTest {
public static void main(String[] args) {
	
	int [] a={1,2,3,4,5,3,1};
	
	
	boolean flag=false;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.print(a[j]+" ");
				
				flag=true;
				
			}
		}
	}
	if(flag=false)
	{
		System.out.println("Not found any duplicates");
	}
	
}
}
