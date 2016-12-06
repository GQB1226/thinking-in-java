package chapter7;

public class C20 {
	public static void main(String[] args) {
		
	}
}

class A20{
	private void a(){
		System.out.println("A20 a()");
	}
	public void b() {
		System.out.println("A20 b()");
	}
}

class B20 extends A20{
	@Override
	public void b(){
		System.out.println("B20 Override A20 b()");
	}

//	ok
//	public void a(){
//		System.out.println("B20 a()");
//	}
	
//	error
//	@Override
//	public void a(){
//		
//	}
}