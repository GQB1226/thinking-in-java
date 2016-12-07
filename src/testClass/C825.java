package testClass;

public class C825 {

	public static void main(String[] args) {
		Super sup = new Sup();
		System.out.println("sup. field=" + sup.field + ", sup.getField() is:" + sup.getField());
		Sup sup1 = new Sup();
		System.out.println("sup1. field=" + sup1.field + ", sup1.getField() is:" + sup1.getField()
				+ ", sup1.getSuperField() is:" + sup1.getSuperField());
	}

}

class Super {
	public int field = 0;

	public int getField() {
		return field;
	}

}

class Sup extends Super {
	public int field = 1;
	
	public int getField() {
		return field;
	}

	public int getSuperField() {
		return super.field;
	}
}