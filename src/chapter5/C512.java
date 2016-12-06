package chapter5;

public class C512 {
	public static void main(String[] args) {
		Test aTest=new Test("b");
		System.out.println(aTest.str1);
		System.out.println(aTest.str2);
	}
}
class Test{
	String str1="a";
	String str2;
	Test(String a){
		System.out.println(str1);
		System.out.println(str2);
		str2=a;
	}
}