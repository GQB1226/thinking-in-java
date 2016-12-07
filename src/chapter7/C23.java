package chapter7;

public class C23 extends B23{
	static{
		System.out.println("C23");
	}
	private int a=2;
	{
		System.out.println(a);
	}
	public C23(){
		System.out.println("cc");
	}
	public static void main(String[] args) {
		C23 c23=new C23();
	}
}

class A23{
	public static int a=10;
	static {
		System.out.println("static");
		System.out.println("1,a="+a);
	}
	{
		System.out.println("a="+a);
	}
	public A23() {
		System.out.println("inited!a="+a);
	}
}
class B23 extends A23{
	static{
		System.out.println("A23 a="+a);
	}
	public B23() {
		System.out.println("b23 inited!");
	}
}
