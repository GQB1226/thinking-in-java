package testClass;

public class C833 {
	public static void main(String[] args) {
		RoundClyph roundClyph=new RoundClyph(3);
	}
}

class Clyph{
	public Clyph(){
		System.out.println("Clyph initing......");
		draw();
		System.out.println("Clyph drawed");
	}
	void draw(){
		System.out.println("Clyph.draw()");
	}
}

class RoundClyph extends Clyph{
	private int r=1;
	public RoundClyph(int i) {
		r=i;
		System.out.println("RoundClyph initing r="+r);
	}
	void draw(){
		System.out.println("RoundClyph.draw() r="+r);
	}
}