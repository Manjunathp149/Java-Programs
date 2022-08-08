package Arrays;

public class MaxNumInArrayTest {
public static void main(String[] args) {
	/* int [] a={1234,546,987,5989,597, 1};
	int max=a[0]     ;
	
	for(int i=1;i<a.length;i++)
	{
		if(a[0]<a[i])
		{
			max=a[i];
		}
	}
	System.out.println(max);
}*/

int [] a={2,2,1234,546,987,5989,597};
int min=a[0];

for(int i=1;i<a.length;i++)
{
	if(a[0]>a[i])
	{
		min=a[i];
	}
}
System.out.println(min);
}
}
