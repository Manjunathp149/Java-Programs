package String;

import java.util.LinkedHashSet;

public class PrintOnlyVowelsTest {

	
	public static void main(String [] srgs)
	{
	String s="india";
	
	
	
	/*for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	{
	System.out.print(s.charAt(i)+" ");
	}
	}*/
	
	
	/*	LinkedHashSet<Character>  set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				set.add(s.charAt(i));
			}
		}
		
		for(Character ch:set)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch+" ");
			}
		
	}
	}*/
	

	int a=25;
	int b=22;

	a=a+b;
	b=a-b;
	a=a-b;
	System.out.print(a+" "+b);
	
	
}}
