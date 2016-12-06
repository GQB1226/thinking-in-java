package chapter7;

public class C713 {
	public static void main(String[] args) {
		B13 b=new B13();
		b.a();
		b.a(1);
		b.a('a');
		b.a(10.0f);
		b.a(10);
	}
}
class A13{
	public void a(){
		System.out.println("a() called");
	}
	public void a(int i){
		System.out.println("a("+i+") called");
	}
	public void a(char c){
		System.out.println("a("+c+") called");
	}
}

class B13 extends A13{
	public void a(float f){
		System.out.println("a("+f+") called");
	}
}