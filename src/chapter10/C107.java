package chapter10;

public class C107 {
	
	private int i=0;
	private int addI(int i){
		return this.i+i;
	}
	
	class B107{
		public void test(){
			System.out.println(i);
			i=i+1;
			System.out.println(i);
			addI(3);
			System.out.println(addI(3));
			
		}
	}
	public static void main(String[] args) {
		getInner();
	}
	private static void getInner() {
		C107 c107=new C107();
		C107.B107 b=c107.new B107();
		b.test();
	}
}
