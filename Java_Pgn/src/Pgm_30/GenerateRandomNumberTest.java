package Pgm_30;

import java.awt.image.renderable.RenderableImageOp;
import java.util.Random;

public class GenerateRandomNumberTest {
public static void main(String[] args) {
	
	Random random=new Random();
	int r =random.nextInt(500);
	System.out.println(r);
}
}
