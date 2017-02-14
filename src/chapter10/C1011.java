package chapter10;

public class C1011 {
	private class Inner implements I109{
		private int value=8;
		@Override
		public int value() {
			return value;
		}
		
	}
	public I109 inner(){
		return new Inner();
	}
	public static void main(String[] args) {
		C1011 c=new C1011();
		System.out.println(c.inner().value());
		
	}
}
