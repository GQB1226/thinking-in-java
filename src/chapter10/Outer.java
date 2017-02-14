package chapter10;

public class Outer {
	class Inner{
		public Inner() {
			System.out.println("Inner inited");
		}
	}
	public Inner getInner(){
		return new Inner();
	}
	public Outer() {
		System.out.println("Outter innted");
	}
	public static void main(String[] args) {
		Inner a=new Outer().getInner();
		
	}
}

