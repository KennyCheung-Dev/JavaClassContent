package Collections;

public class BoxNonGeneric {
	String item1;
	String item2;
	
	public BoxNonGeneric(String item1, String item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public String ExportItem1() {
		return item1;
	}
	
	public String ExportItem2() {
		return item2;
	}
}
