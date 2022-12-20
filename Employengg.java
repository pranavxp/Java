package pranavlab;
import java.util.Scanner;
class Employee{
	float basic_sal,DA,TA,sal;
	void calcsal(){
		sal=basic_sal+DA+TA;
		System.out.println("The employee salary is "+sal);	
	}
	void display(){
		System.out.println("The name of the class is 'Employee'");
	}
}
class Engineer extends Employee{
	Engineer(float a, float b, float c)
	{
		basic_sal=a;
		DA=b;
		TA=c;
	}
	void calcsal()
	{
		super.calcsal();
		System.out.println("The Engineer salary is "+(2*sal));
	}
	void display()
	{
		super.display();
		System.out.println("The name of the class is 'Engineer'");
	}
}
public class Employengg
{
	public static void main(String[] args)
	{
			float basic, ta, da;
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the basic salary");
			basic=sc.nextInt();
			System.out.println("Enter the DA");
			da=sc.nextInt();
			System.out.println("Enter the TA");
			ta=sc.nextInt();
			Engineer obj = new Engineer(basic,da,ta);
			obj.calcsal();
			obj.display();
	}
}
