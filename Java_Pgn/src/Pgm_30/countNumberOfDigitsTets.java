package Pgm_30;

public class countNumberOfDigitsTets {
public static void main(String[] args) {
	int num=1535636;
	int count=0;
	
	while(num>0)
	{
	num=num/10;
			count++;
	}
	System.out.println(count);
	
	
}
}
