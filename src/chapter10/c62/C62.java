package chapter10.c62;

import chapter10.c61.Contents;

public class C62 {

	protected class B62 implements Contents {
		private int i = 0;

		public B62(int i) {
			this.i = i;
		}

		@Override
		public int count() {
			return i++;
		}

	}
	
	public Contents contents(){
		return new B62(3);
	}

	public static void main(String[] args) {

	}
}
