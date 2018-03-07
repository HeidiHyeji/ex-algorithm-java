package io;
import java.util.Scanner;
public class Print10CharaterToken11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len=str.length();
		for(int i=0;i+10<=len;i=i+10) {
			System.out.println(str.substring(i, i+10));
		}
		if(len%10!=0)
			System.out.println(str.substring(len-len%10,len));
	}
}
