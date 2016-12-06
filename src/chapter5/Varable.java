package chapter5;


public class Varable {
	public static void main(String[] args) {
		System.out.println("测试可变参数");
		print(11);
		print(12,13,154);
		print("af");
		print("a","bc","def");
		print();
	}

	private static void print(Object... obj) {
		
		for(Object o:obj){
			System.out.print(o+"\t");
		}
		System.out.print('\n');
	}
}
