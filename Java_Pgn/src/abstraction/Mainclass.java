package abstraction;
abstract class BMW
{
	abstract void wheel();
	abstract void brake();
	public void chassy()
	{
		System.out.println("CI chassy");
	}
}
class BMWQ extends BMW
{
	public void wheel()
	{
		System.out.println("Alloy wheel");
	}
	public void brake()
	{
		System.out.println("EBS brake");
	}
	
}
public class Mainclass {
	public static void main(String[] args) {
		BMWQ b=new BMWQ();
		b.wheel();
		b.brake();
		b.chassy();
	}
}
				