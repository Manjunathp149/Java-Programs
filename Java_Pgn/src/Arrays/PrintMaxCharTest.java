package Arrays;

public class PrintMaxCharTest {
public static void main(String[] args) {
	

	String[] s={"hi","Manjunath","lili"};
	String max=s[0];
	
	for(int i=1;i<s.length;i++)
	{
		if(max.length()<s[i].length())
		{
			max=s[i];
		}
	
	}
	for(int i=0;i<s.length;i++)
	{
		if(max.length()==s[i].length())
		{
			System.out.println(s[i]);
		}
	
	
	
	
	
	
	
	
	
	
	/*for(int i=0;i<s.length;i++)
	{
		if(max.length()<s[i].length())
		{
			max=s[i];
		}
		for(int i1=0;i1<s.length;i1++)
		{
			if(max.length()==s[i1].length())
			{
				System.out.println(max.length());
			}
		}
	}*/
}
}}
