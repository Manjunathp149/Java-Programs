package Arrays;

import java.util.Iterator;

public class GetArrayAsRequiredTest {

	public static void main(String[] args) {
		
		int [] a={1,2,3,4,5};
		int key=1;
		
		for (int n = 0; n< key; n++) {
			int temp=a[0];
			for (int i = 01; i < a.length; i++) {
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
