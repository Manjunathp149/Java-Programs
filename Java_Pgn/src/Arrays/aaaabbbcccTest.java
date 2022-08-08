package Arrays;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class aaaabbbcccTest {

	public static void main(String[] args) {
		
		String s="bfhdvdgggggddd";
	
		TreeSet<Character> set=new TreeSet<>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character ch:set)
		{
			//System.out.print(ch);
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
				System.out.print(ch);
				}
			}
		}
	}
}
