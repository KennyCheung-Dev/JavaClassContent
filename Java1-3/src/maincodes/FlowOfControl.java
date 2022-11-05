package maincodes;

public class FlowOfControl {

	public static void main(String[] args) {
		customGreetMsg("Chihiro");
		customGreetMsg("Yubaba");
	}
	
	public static void customGreetMsg(String name) {
		System.out.println("Hello " + name);
	}
	
	//Flow of Control - No Return Statement
	//When customGreetMsg is called, the main function pause execution,
	//Control of the program is handed over to customGreetMsg()
	//Once finish execution, control will be handed back to the calling function
	//Then same thing for second customGreetMsg
	//Eventually we  reach the end of the code block of main(), finishes the program

}
