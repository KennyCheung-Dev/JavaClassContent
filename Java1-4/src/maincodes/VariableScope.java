package maincodes;

public class VariableScope {
	static String num = "10";
	public static void main(String[] args) {
		
		sayHi("Kenny");
		sayBye("Kenny");
		
		num = "20";
		
		sayHi("Kenny");
		sayBye("Kenny");
	}
	
	/*
	 * We know that variables shouldn't have the same name.
	 * However, this isn't 100% true.
	 * Look at the following 2 methods:
	 */
	
	public static void sayHi(String name) {
		String message = "Hi" + name + num;
		System.out.println(message);
	}
	
	public static void sayBye(String name) {
		String message = "Bye" + name + num;
		System.out.println(message);
	}
	
	/*
	 * The variables "message" 
	 * is only accessible from the method they were declared in.
	 * Because they are declared within the method,  they become a "local variable"
	 * Their "scope" is limited to the method they were declared in.
	 * Therefore
	 * Even though we have declared two variable with the same name, 
	 * they will not override each other, we will get both answer when calling them respectively
	 */
	
	/*
	 * Method/Function parameters are also local variables (name in previous methods)
	 */
	
	/* Class Variable / Global Variable / Static Variable 
	 * (Don't care about the name for  now), just know its' use
	 * If we have a variable declared in a Class, you can access it throughout all the methods
	 */
}
