package programming;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromStringTest {

	
	public static void main(String[] args)
	{
	String s="Hello";
	
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	
	for(int i=0;i<s.length();i++)
	{
	System.out.print(s.charAt(i));
	set.add(s.charAt(i));
	}
	System.out.println(set);
	}
}
