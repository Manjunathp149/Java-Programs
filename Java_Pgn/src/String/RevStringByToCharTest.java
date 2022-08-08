package String;

public class RevStringByToCharTest {

	public static void main(String[] args) {
		String s="SDET";
		 char[] ch=s.toCharArray();
		 
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}	
	}
		
	
}
