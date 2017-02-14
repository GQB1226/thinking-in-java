package chapter10;

public class C109 {
	private I109 i109(){
		class InnerI109 implements I109{
			int i=8;
			
			public int value() {
				return i;
			}
			
		}
		return new InnerI109();
	}
	private I109 C1010(boolean b){
		if(b){
			class InnerI109 implements I109{
				int i=6;
				@Override
				public int value() {
					return i;
				}
				
			}
			return new InnerI109();
		}
		else {
			return null;
		}
	
	}
	
	public static void main(String[] args) {
		C109 c=new C109();
		int a=c.i109().value();
		System.out.println(a);
		System.out.println(c.C1010(true));
	}
}
