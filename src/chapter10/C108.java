package chapter10;

public class C108 {
	class B108{
		private int i=10;
	}
	public static void main(String[] args) {
		C108 c108=new C108();
		C108.B108 b=c108.new B108();
		System.out.println(b.i);
	}
}
