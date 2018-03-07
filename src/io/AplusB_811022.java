package io;
import java.util.Scanner;
public class AplusB_811022 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		int a=0;
		int b=0;
		for(int i=1;i<=T;i++) {
			a= sc.nextInt();
			b= sc.nextInt();
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
		}
	}
}
