package Ram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class COuntNumber {

	
//	int[] a={1,2,2,1};
//
//	LinkedHashSet<Integer> set=new LinkedHashSet<>();
//
//	for(int i=0;i<a.length;i++)
//	{
//	set.add(a[i]);
//	}
//
//	for(Integer It:set)
//	{
//	int count=0;
//	for(int i=0;i<a.length;i++)
//	{
//	if(It==a[i])
//	{
//	count++;
//	}
//	}
//	System.out.println(It+"="+count);
//	}
	
		
		
		
		public static void main(String[] args)
		{
		int[] a= {3,0,2,0,0,5};
		int[] b=new int[a.length];
		int m=0;
		int n=a.length-1;
		for (int i = 0; i < a.length; i++)
		{
		if(a[i]==0)
		{
		b[n]=a[i];
		n--;
		}
		else
		{
		b[m]=a[i];
		m++;
		}
		}
		for (int j = 0; j < a.length; j++)
		{
		System.out.print(b[j]);
		}
		}
}
