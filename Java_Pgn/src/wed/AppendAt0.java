package wed;

import java.util.ArrayList;
import java.util.Iterator;

public class AppendAt0 {
	public static void main(String[] args)
	{
	int[] a={0,1,0,0,1,1,1,0,0};//it is correct method
	
	ArrayList<Integer> set=new ArrayList<>();
	for (int j = 0; j < a.length; j++) {
		set.add(a[j]);
	}
	for (Integer integer : set) {
		System.out.println(integer);
	}

	
	}
}
