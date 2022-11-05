package maincodes;

public class UseCase2 {

	public static void main(String[] args) {
		
		// Use case 2
		
		//Passing Parameters
		
		customGrettMsg("Geralt");
		customGrettMsg("a person with a different name");
	}
	
	public static void customGrettMsg(String name) {
		System.out.println("Hello " + name);
	}

}
