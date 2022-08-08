package Arrays;

import java.util.LinkedHashSet;

public class NOnRepeatedNumbersInArrayTest {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		int count=0;
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++)
		
			{
				set.add(a[i]);
		
			for(int j=i+1;i<a.length;j++)
			{
				if(a[j]==a[j])
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
