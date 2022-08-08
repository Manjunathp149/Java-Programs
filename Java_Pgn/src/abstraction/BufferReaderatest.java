package abstraction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderatest {
public static void main(String[] args) throws IOException  {
	FileReader fr =new FileReader("C:/Users/Reshma/Desktop/interview preparation.txt");
	BufferedReader br =new BufferedReader(fr);
	
	
	String str;
	while((str=br.readLine())!=null)
	{
		System.out.println(str);
	}
	
}
}
