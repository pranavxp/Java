package pranavlab;
abstract class Shapes
{
	abstract void numberofsides();	
}
class Rectangle extends Shapes
{
		void numberofsides()
		{
			System.out.println("I am a Rectangle and I have 4 sides.\n");
		}
}
class Triangle extends Shapes
{
	void numberofsides()
	{
		System.out.println("I am a Triangle and I have 3 sides.\n");
	}
}
class Hexagon extends Shapes
{
	void numberofsides()
	{
		System.out.println("I am a Hexagon and I have 6 sides.\n");
	}
}
public class Polymorphism
{
	public static void main(String[] args)
	{
		Rectangle ob=new Rectangle();
		ob.numberofsides();
		Triangle obj= new Triangle();
		obj.numberofsides();
		Hexagon obje= new Hexagon();
		obje.numberofsides();
	}
}