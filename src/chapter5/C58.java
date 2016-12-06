package chapter5;

public class C58 {
	public static void main(String[] args) {
		new Test8().method1();
	}
}
class Test8{
	public void method1(){
		System.out.println("directly call method2");
		method2();
		System.out.println("call method2 by this");
		this.method2();
	}
	private void method2(){
		System.out.println("a");
	}
}