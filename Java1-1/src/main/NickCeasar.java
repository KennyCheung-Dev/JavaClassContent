package main;

import java.util.Scanner;

public class NickCeasar{
	
	public static Scanner sc = new Scanner(System.in);
	
	static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
    public static void main(String[] args){
    	System.out.println("Encode or decode?");
    	String process = sc.nextLine();
    	System.out.print("Enter a string to " + process +": ");
    	String h= sc.nextLine();
    	System.out.print("Enter a key to " + process + ": ");
    	int key = sc.nextInt();
    	System.out.println(CeasarSalad(h, key, process));
    	//Output: MjqqBtwqi
    }
    public static String CeasarSalad(String input, int code1, String process) {
    	String output = "";
    	char alpha;
    	if ("decode".equals(process)){
    		code1 = 26 - code1;
    		while (code1 < 0) {
    			code1+=26;
    		}
    		
    	}
    	int code = code1%26;
    	for(int i = 0; i <input.length(); i+=1) {
    		alpha = input.charAt(i);
    		
    		if(alpha >= 'a' && alpha <= 'z') {
    			alpha = (char)(alpha + code);
    			if(alpha > 'z') {
    				alpha = (char)(alpha+'a'-'z'-1);
    			}
    			output += alpha;
    		}
    		else if (alpha >= 'A' && alpha<= 'Z') {
    			alpha = (char)(alpha + code);
    			if (alpha > 'Z') {
    				alpha = (char)(alpha+'a'-'z'-1);
    			}
    			output += alpha;
    			
    		}
    		else {
    			output += alpha;
    		}
    	}
		return output;
    }
}
