package chapter5;

public class C59 {
	public static void main(String[] args) {
		Test9 test9=new Test9(3,"vv");
		
	}
}

class Test9{
	String string="init value";
	int test9=0;
	Test9(){
		System.out.println("string:"+string+";test9:"+test9);
	}
	Test9(int i){
		this("aa");
		test9=i;
		System.out.println("string:"+string+";test9:"+test9);
	}
	Test9(String string){
		this();
		this.string=string;
		System.out.println("string:"+string+";test9:"+test9);
	}
	Test9(int i,String string){
		this(1);
		this.string=string;
		test9=i;
		System.out.println("string:"+string+";test9:"+test9);
		
		// error constructor must be called at first
		//this(1);
		
	}
}
