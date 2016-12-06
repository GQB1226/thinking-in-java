package chapter7;

import java.util.Random;

public class FinalTest {
	
	private String id;
	private static  Random rand =new Random(1226);
	private final int Value_1=9;
	{
		System.out.println(rand+" "+Value_1+" "+Value_2+" "+VALUE_3);
	}
	public FinalTest(String id) {
		System.out.println(rand);
		this.id=id;
	}
	private static Value v1=new Value(1);
	private final Value v2=new Value(2);
	private static final Value v3=new Value(3);
	private Value v4=new Value(4);

	private final static int Value_2=10;
	public final static int VALUE_3=12;
	
	public static void main(String[] args) {
		
		FinalTest fd=new FinalTest("aa");
		System.err.println(fd.id);
//		fd.Value_1++;
//		fd.Value_2++;
//		fd.v1++;
//		fd.v2=new Value(5);
		System.out.println(fd.v2.i);
		fd.v2.i=10;
		System.out.println(fd.v2.i);
		//fd.v2=3;
//		fd.v3=new Value(6);
		
	}
}

class Value{
	int i;
	public Value(int i) {
		this.i=i;
	}
}
