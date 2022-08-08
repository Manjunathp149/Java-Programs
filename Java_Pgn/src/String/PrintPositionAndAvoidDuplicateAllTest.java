package String;

import java.util.LinkedHashSet;

public class PrintPositionAndAvoidDuplicateAllTest {

	
	public static void main(String[] args)
	{
		String s1="MAnjunath";
		String s = s1.toLowerCase();
		//int r = Integer.parseInt(s1);
		//System.out.println(r);
		
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
