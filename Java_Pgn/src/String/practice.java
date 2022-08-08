package String;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class practice {

	
	public static void main(String[] args) {

String s="manjunath";

LinkedHashSet<Character> set =new LinkedHashSet<Character>();
for(int i=s.length()-1;i>=0;i--)
{
	set.add(s.charAt(i));
}

for(Character ch:set)
{
	for(int i=s.length()-1;i>=0;i--)
	{
		if(ch.equals(s.charAt(i)))
		{
			System.out.println(s.charAt(i)+"="+(i+1));
			break;
		}
	}
}
	
		}
	}
