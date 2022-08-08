package String;

import java.util.LinkedHashSet;

public class PrintPositionByReverseOrderTest {

	public static void main(String[] args) {
		/*String s1="Tester";
		String s=s1.toLowerCase();
		
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1));
					break;
				}
			}
		}*/
		
		
		
		
	/*	String s1="Tester";
		String s=s1.toLowerCase();
		
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1));
					break;
				}
			}
		}
	}*/
		
		/*String s2=" Tester ";
			String s1  = s2.trim();
		String s=s1.toLowerCase();
		
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1));
					break;
				}
			}
		}
	}*/
	
	
	
	String s2="        Tester  ";
	String s1  = s2.replace(" ","");
 String s=s1.toLowerCase();


LinkedHashSet<Character> set=new LinkedHashSet<>();

for(int i=s.length()-1;i>=0;i--)
{
	set.add(s.charAt(i));
}
for(Character ch:set)
{
	for(int i=s.length()-1;i>=0;i--)
	{
		if(ch==s.charAt(i))
		{
			System.out.println(ch+" "+(i+1));
			break;
		}
	}
}
}
	
}
