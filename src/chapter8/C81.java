package chapter8;

public class C81 {
	
	public static void main(String[] args) {
		Unicycle unicycle=new Unicycle();
		ride(unicycle);
		ride(new Bicycle());
		ride(new Tricycle());
	}

	private static void ride(Cycle c) {
		c.driving();
	}
	

}
class Cycle{
	public void driving(){
		System.out.println("driving......");
	}
}
class Unicycle extends Cycle{
	
}
class Bicycle extends Cycle{
	
}
class Tricycle extends Cycle{
	
}