package wed;

import java.util.LinkedHashSet;

public class CountnumbrOfOccuranceTest {
public static void main(String[] args) {
	
	int[] a={1,2,3,4,4,5};
	
	
	
	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		set.add(a[i]);
	}
	
	for (Integer integer : set) 
	{
		int count=0;
		for (int  i= 0; i < a.length; i++)
		{
			if(integer==a[i])
			{
				count++;
			}
		}
		System.out.println(integer+" "+count);
	}
	
}
}
