package String;

public class RemoveSpaceTest {
public static void main(String[] args) {
	String s="Hi i am manjunath";
	
	
	//String s1=s.replace(" ", "");
	String[] s1 = s.split(" ");
	
	for(int i=0;i<s1.length;i++)
	{
		System.out.print(s1[i]);
	}
	
	
  /*String s="hi i am manjunath";
	
	//String s1=s.replace(" ", "");
	String[] s1 = s.split(" ");
	
	for(int i=0;i<s1.length;i++)
	{
		 char ftch = (char)(s1[i].charAt(0)-32);
		String sub = s1[i].substring(1);
		System.out.print(ftch+sub+" ");
	}*/
	
	
	
}
}
