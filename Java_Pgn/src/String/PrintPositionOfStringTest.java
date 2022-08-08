package String;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PrintPositionOfStringTest {

	public static void main(String[] args)
	{
		String s="manjunath";
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		//TreeSet<Character> set=new TreeSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for( Character ch:set)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+"="+(i+1));
				}
			}
		}
	}
}
