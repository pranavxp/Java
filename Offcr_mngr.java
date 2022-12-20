package pranavlab;
import java.util.Scanner;
class Employ
{
	int age;
	float salary;
	String phone;
	String name, address;
	Employ(String nam,String addr, int ag,double s2,String phn)
	{
		name=nam;
		address=addr;
		age=ag;
		salary=(float) s2;
		phone=phn;
	}
	void printsalary()
	{
		System.out.println("The salary is "+salary);
	}
}
class Officer extends Employ
{
	String special;
	Officer(String nam,String addr, int ag, float s2, String phn,String s)
	{
		super(nam, addr, ag, s2, phn);
		special=s;
		
	}
	void display()
	{
		System.out.println("Officer details\n");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		System.out.println("Phone number: "+phone);
		System.out.print("Specialisation: "+special);
		super.printsalary();
	}
	
}
class Manager extends Employ
{
	String dept;
	Manager(String nam,int u, double v, String w, String phn,String d)
	{
		super(nam, w, u, v, phn);
		dept=d;
	}
	void display()
	{
		System.out.println("Manager details\n");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		System.out.println("Phone number: "+phone);
		super.printsalary();
		System.out.println("Department: "+dept);
	}
}
public class Offcr_mngr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the officer details:\n");
		System.out.print("Enter the name: ");
		String n=sc.next();
		System.out.print("Enter the age: ");
		int a =sc.nextInt();
		System.out.print("Enter the phone number: ");
		String p=sc.next();
		System.out.print("Enter the address: ");
		String d=sc.next();
		System.out.print("Enter the salary: ");
		float s=sc.nextFloat();
		System.out.print("Enter the specialization: ");
		String sp=sc.next();
		Officer of=new Officer(n,d,a,s,p,sp);
		System.out.println("\n");
		Scanner sca= new Scanner(System.in);
		System.out.println("Enter Manager details:\n");
		System.out.print("Enter the name: ");
		String t=sca.next();
		System.out.print("Enter the age: ");
		int u =sca.nextInt();
		System.out.print("Enter the phone number: ");
		String v=sca.next();
		System.out.print("Enter the address: ");
		String w=sca.next();
		System.out.print("Enter the salary: ");
		float x=sca.nextFloat();
		System.out.print("Enter the department: ");
		String dpt=sca.next();
		Manager man=new Manager(t,u,x,w,v,dpt);
		System.out.println("\n");		
		System.out.println("Officer Details: \n");
		System.out.println("Name: "+of.name);
		System.out.println("Age: "+of.age);
		System.out.println("Phone Number: "+of.phone);
		System.out.println("Address: "+of.address);
		System.out.println("Salary: "+of.salary);
		System.out.println("Specialization: "+of.special);
		System.out.println("\n");
		System.out.println("Manager details: \n");
		System.out.println("Name: "+man.name);
		System.out.println("Age: "+man.age);
		System.out.println("Phone Number: "+man.phone);
		System.out.println("Address: "+man.address);
		System.out.println("Salary: "+man.salary);
		System.out.println("Department: "+man.dept);
	}
}
