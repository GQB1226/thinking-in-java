package chapter9;

public class C93 {
	public static void main(String[] args) {
		B93 b9=new B93();
		b9.print();
	}
}

abstract class Base{
	public Base() {
		print();
	}
	abstract public void print();
}
class B93 extends Base{
	int a=1;

	@Override
	public void print() {
		System.out.println(a);
	}
	
}