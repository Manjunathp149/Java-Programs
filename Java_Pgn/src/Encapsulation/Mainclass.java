package Encapsulation;

class Sample
{
	private int x=10;

	public int getX() 
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}
}
public class Mainclass 
{
	public static void main(String[] args)
	{
		Sample s1=new Sample();
		System.out.println(s1.getX());
		s1.setX(20);
		System.out.println(s1.getX());
	}

}
