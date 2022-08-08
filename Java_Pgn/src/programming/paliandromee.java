package programming;

public class paliandromee {
	public static void main(String[] args) {
		String s="nom";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("its a palindrome");
		}
		else if(s.equalsIgnoreCase(rev))
		{
			System.out.println("its actually palindrome");

		}
		else
		{
			System.out.println("its a not palindrome");

		}
}
}
