package String;

public class ReverseSentenceTest1 {

	
	public static void main(String[] args) {
		/*String s="Hi i am From Dharwad";
		String[] s1 = s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		System.out.println();
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]);
		}*/
		
	   /*String s="Hi i am From Dharwad";
		String[] s1 = s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
		String s2 =s1[i];
		for(int j=s2.length()-1;j>=0;j--)
		{
			System.out.print(s2.charAt(j));
		}
		System.out.print(" ");   //op -dawrahD morF ma i iH 
	}*/
		
		String s="Hi i am From Dharwad";
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
		String s2 =s1[i];
		for(int j=s1[i].length()-1;j>=0;j--)
		{
			System.out.print(s1[i].charAt(j));
		}
		System.out.print(" ");   // op-iH i ma morF dawrahD  
	}
		
	/*	String s="Hi i am From Dharwad";
		String[] s1 = s.split(" ");
		
		
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");    // op-   Dharwad i am From Hi 
	}*/
	}}
