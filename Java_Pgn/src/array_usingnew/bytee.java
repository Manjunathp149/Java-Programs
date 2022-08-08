package array_usingnew;

public class bytee {
	public static void main(String[] args) {
		byte[] arr=new byte[4];
		arr[0]=10;
		arr[1]=99;
		arr[2]=20;
		arr[3]=89;
		System.out.println("index"+"\t"+"value");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"\t"+arr[i]);
		}
		
	}

}
