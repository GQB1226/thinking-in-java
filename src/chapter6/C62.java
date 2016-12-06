package chapter6;

import testClass.C62Packdefalut;

public class C62 {
	public static void main(String[] args) {
		C62Packdefalut packdefalut=new C62Packdefalut();
		packdefalut.b();
		packdefalut.a();
		Test6 t6=new Test6();
		t6.a();
		t6.b();
	}
}
class Test6 extends C62Packdefalut{
	public void t(){
		b();
		a();
	}
}
class Test61 {
	public void t(){
	}
}
class Test62{
	void a(){
		System.out.println("a");
	};
	protected void b() {
		System.out.println("b");
	}
	
}

class Test63 extends Test62{
	public void c(){
		a();
		b();
	}
}