package chapter5;

public class C54 {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
}
class Person{
	public void eat(Apple apple){
		Apple peelered=apple.getPeeler();
		System.out.println("ok");
	}
}

class Peeler{
	static Apple peeler(Apple apple){
		return apple;
	}
}

class Apple{
	Apple getPeeler(){
		return Peeler.peeler(this);
	}
}