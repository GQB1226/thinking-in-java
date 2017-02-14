package chapter9;

public class C92 {
	public static void main(String[] args) {
//		Cannot instantiate the type A92
		A92 a92=new D92();
		B92 b92=new E92();
	}
}
abstract class A92{
	public void a(){
		
	}
}
abstract class B92{
	public abstract void a();
}

class D92 extends A92{
	
}
class E92 extends B92{

	@Override
	public void a() {
		System.out.println("hh");
		
	}
	
}