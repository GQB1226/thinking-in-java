package chapter7;

public class C21 {
	public static void main(String[] args) {
		
	}
}
class A21{
	public void a(){
		System.out.println("A21 a()");
	}
	public final void b(){
		System.out.println("A21 final b()");
	}
}

class B21 extends A21{
// error	
//	public void b(){
//		
//	}
}