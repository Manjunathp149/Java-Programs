package programming;

import java.util.LinkedHashSet;

public class CpuntDuplicatesInStringTest {

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
	
	for(Character ch:set)
	{
		System.out.println(ch);
	}
}}
