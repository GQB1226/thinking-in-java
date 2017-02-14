package chapter10;

import testClass.Selector;


public class Sequence {
	private Object[] item;
	private int next=0;
	public Sequence(int i) {
		item=new Object[i];
	}
	public void add(Object c){
		if(next<item.length){
			item[next++]=c;
		}
	}
	private class SequenceSelector implements Selector{
		private int i=0;
		@Override
		public boolean end() {
			return i==item.length;
		}

		@Override
		public Object current() {
			return item[i];
		}

		@Override
		public void next() {
			if(i<item.length){
				i++;
			}
		}
		
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Sequence sequence=new Sequence(2);
		C10A a=new C10A("hello");
		C10A b=new C10A("world");
		sequence.add(a);
		sequence.add(b);
		Selector sequenceSelector=sequence.selector();
		while(!sequenceSelector.end()){
			C10A tmp=(C10A) sequenceSelector.current();
			tmp.toStringa();
			sequenceSelector.next();
		}
		
		
		
	}
}
class C10A{
	private String string;
	public C10A(String s) {
		string=s;
	}
	public void toStringa(){
		System.out.println(string);
	}
}
