package String;

public class RevStringDirectTesr {

	public static void main(String[] args) {
		String s="Manjunath";
		String s1 = s.toLowerCase();
		// char[] ch=s.toCharArray();
		 
	for(int i=s1.length()-1;i>=0;i--)
	{
		System.out.print(s1.charAt(i));
	}	
	}
}
