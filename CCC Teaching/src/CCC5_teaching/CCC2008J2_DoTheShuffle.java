package CCC5_teaching;

import java.util.Scanner;

public class CCC2008J2_DoTheShuffle {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int button=0;
		String [] arr = {"A","B","C","D","E"};
		while (button!=4) {
			button = sc.nextInt();
			int time = sc.nextInt();
			arr=MusicSwap(arr,button,time);
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static String[] MusicSwap(String[] arr, int button, int time) {
		String [] result = arr;
		if(button==1) {
			for(int i=0;i<arr.length-1;i++) {
				result[i]=arr[i+1];
			}
			result[4]=arr[0];
		}
		if(button==2) {
			result[0]=arr[4];
			for(int i=1;i<arr.length;i++) {
				result[i]=arr[i-1];
			}
		}
		if(button==3) {
			String temp=result[0];
			result[0]=result[1];
			result[1]=temp;
		}
		return result;
	}
}
