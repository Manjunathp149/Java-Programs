package abstraction;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffreWrite {
public static void main(String[] args) throws IOException {
	FileWriter file =new FileWriter("C:/Users/Reshma/Desktop/API.txt");
	BufferedWriter br=new BufferedWriter(file);
	 
	br.write("Hi i am manjunath");
	br.write("From dharwad");

		System.out.println("processed");
		
		br.close();
}
}
