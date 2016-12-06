package chapter7;

public class C75 {
	public static void main(String[] args) {
		C c=new C();
	}
}

class A{
	A(){
		System.out.println("A inited");
	}
}
class B{
	B(){
		System.out.println("B inited");
	}
}

class C extends A{
	B b =new B();
}