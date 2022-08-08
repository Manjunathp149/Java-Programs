package String;

import java.util.LinkedHashSet;

public class PrintPositionAndAvoidDuplicateTest {

	
	public static void main(String[] args)
	{
		String s="manjunath";
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
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
					break;
				}
			}
		}
	}
}
