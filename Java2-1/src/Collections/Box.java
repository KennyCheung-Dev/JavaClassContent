package Collections;

public class Box<T1, T2> {
	public T1 item1;
	public T2 item2;
	
	public Box(T1 item1, T2 item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public T1 ExportItem1() {
		return item1;
	}
	
	public T2 ExportItem2() {
		return item2;
	}
}
