package pranavlab;
import java.util.Scanner;
class Area{
	//Circle area
	void area(float radius){
		float area=(float)(3.14*radius*radius);
		System.out.println("The area of the circle is "+area+"\n");
	}
	//Rectangle area
	void area(int length,int breadth) {
		float area=(float)(length*breadth);
		System.out.println("The area of the rectangle is "+area+"\n");
	}
	//Triangle area
	void area(float base,float height) {
		float area=(float)(0.5*base*height);
		System.out.println("The area of the triangle is "+area+"\n");
	}

}

public class Ar_Shapes{
	public static void main(String[] args) {
		Area area=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of radius");
		float radius=sc.nextInt();
		System.out.println("Enter the value of length");
		int length=sc.nextInt();
		System.out.println("Enter the value of breadth");
		int breadth=sc.nextInt();
		System.out.println("Enter the value of base");
		float base=sc.nextInt();
		System.out.println("Enter the value of height");
		float height=sc.nextInt();
		area.area(radius);
		area.area(length,breadth);
		area.area(base,height);
		}	
}