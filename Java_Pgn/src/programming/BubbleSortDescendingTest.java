package programming;

import java.util.Arrays;

public class BubbleSortDescendingTest {

	
	public static void main(String[] args)
	{
		
		int  a[]={5,2,8,4,6};
		
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]<a[j])
		{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}}}
		System.out.println("THe array in Descending order is :"+" "+Arrays.toString(a));
}}
