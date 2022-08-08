package String;

public class SwapTwoStringWothoutUsingThirdVariableTest {

	
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "Selenium";
		
		
		s1=s1+s2;  //javaSelenium
				   //01234567891011
		s2=s1.substring(0, s1.length()-s2.length());
		//0,4 java
		s1=s1.substring( s2.length());
		
		System.out.println(s1+" "+s2);
	}
}
