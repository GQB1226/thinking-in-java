package chapter7;

public class C78 {
	public static void main(String[] args) {
		
	}
}

class A{
	A(int i){
		System.out.println("A inited:"+i);
	}
}

class B extends A{
	B(int i){
		super(i);
		System.out.println("B inited:"+i);
	}
//	B(){
//		
//	}
}