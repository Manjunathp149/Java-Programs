package array_usingnew;

public class floatuuu {
	public static void main(String[] args) {
		float[] arr=new float[4];
		arr[0]=100.1f;
		arr[1]=99.99f;
		arr[2]=204.255f;
		arr[3]=89.3333f;
		System.out.println("index"+"\t"+"value");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"\t"+arr[i]);
		}
	}
}
