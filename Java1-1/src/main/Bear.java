package main;

public class Bear {
	private String name;
	private int age; 
	
	
	
	public String GetName() {
		return name;
	}

	public int GetAge() {
		return age;
	}
	
	public void SetAge(int value) {
		age = value;
	}
	
	public Bear(String namePara) {
		name = namePara;
	}
	
	public void SetName(String newName) {
		name = newName;
	}
	
}
