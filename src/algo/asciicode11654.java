package algo;

import java.util.Scanner;
public class asciicode11654 {
	
	private Scanner s;
	private int code;
	private char character;
	public asciicode11654() {
		s=new Scanner(System.in);
	}
	public void run(){
		String str;
		str=s.next();
		character=str.charAt(0);
		System.out.println((int)character+"");
	}
	public static void main(String[] args){
		asciicode11654 m=new asciicode11654();
		m.run();
	}

}
