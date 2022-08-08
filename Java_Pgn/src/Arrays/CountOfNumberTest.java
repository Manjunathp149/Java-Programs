package Arrays;

import java.util.LinkedHashSet;

public class CountOfNumberTest {

	public static void main(String[] args)
	{
		int a[]={1,2,1,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			 set.add(a[i]);
		}

		for(Integer it:set)
		{
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
		if(a[i]==it)
		{
		count++;
		}
		}
		System.out.println(it+":"+count);
		}
	}
	
}
