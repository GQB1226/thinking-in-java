package chapter10.c63;

import chapter10.c61.Contents;
import chapter10.c62.C62;

public class C63 extends C62{
	public static void main(String[] args) {
		getC62();
	}

	private static void getC62() {
		C62 c6=new C62();
		Contents contents=c6.contents();
		System.out.println(contents.count());
		
	}

}
