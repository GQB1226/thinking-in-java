package chapter8;

import java.util.Random;

public class C82 {
	private static RandomGenertor r=new RandomGenertor();
	public static void main(String[] args) {
		Shape[] s=new Shape[10];
		for(int i=0;i<10;i++){
			s[i]=r.next();
			s[i].draw();
		}
		for(Shape sa:s){
			sa.erase();
			sa.log();
		}
		
	}

}

class Shape{
	void draw(){};
	void erase(){};
	void log(){
		System.out.println("this is a log from Base Shape");
	}
}

class Circle extends Shape{
	@Override
	void draw(){
		System.out.println("drawing circle");
	}
	void erase(){
		System.out.println("erasing circle");
	}
	@Override
	void log(){
		
	}
}


class Square extends Shape{
	void draw(){
		System.out.println("drawing square");
	}
	void erase(){
		System.out.println("erasing square");
	}
}

class Triangle extends Shape{
	void draw(){
		System.out.println("drawing triangle");
	}
	void erase(){
		System.out.println("erasing triangle");
	}
}

class RandomGenertor{
	private Random r=new Random();
	public Shape next(){
		switch (r.nextInt(3)) {
		case 0: return new Triangle();
		case 1:return new Square();
		case 2:return new Circle();

		default:
			return new Shape();
		}
	}
}
