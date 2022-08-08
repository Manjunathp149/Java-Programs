package programming;

import java.util.Arrays;

public class BubbleSortTest {

		public static void main(String[] args)
		{
			int a[]={10,5,2,8,9,6};
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if (a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("The array after sorting is"+" "+Arrays.toString(a));
		}
}
