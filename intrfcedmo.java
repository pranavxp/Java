package pranavlab;
interface pet{
	void noofleg();
	void name();
}
 abstract class animal{
	 abstract void eat();
 }
class spider extends animal{
	public void eat(){
		System.out.println("Spider eat insects.");
	}
	public void noofleg() {
		System.out.println("This animal walks by 8 legs.");
	}
 }
class cat extends animal implements pet{
	public void noofleg() {
		System.out.println("This animal walks by 4 legs.");
	}

	public void name() {
		System.out.println("This cat's name is MIMI.");
	}
	void eat() {
		System.out.println("Cat eats fish.");
	}
}
class fish extends animal implements pet{
	public void noofleg() {
		System.out.println("Fish has no legs.");
	}

	public void name() {
		System.out.println("Fish's name is mimi.");
	}
	void eat() {
		System.out.println("Fish eats plants.");
	}
} 
public class intrfcedmo {
public static void main(String[] args) {
		System.out.println("Fish\n");
		fish f=new fish();
		f.name();
		f.eat();
		f.noofleg();
		System.out.println("\n");
		System.out.println("Cat\n");
		cat c=new cat();
		c.name();
		c.noofleg();
		c.eat();
		System.out.println("\n");
		System.out.println("Spider\n");
		spider s=new spider();
		s.eat();
		s.noofleg();
	}
}
