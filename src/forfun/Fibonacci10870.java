package forfun;

import java.util.Scanner;

public class Fibonacci10870 {
	static long f(int n) {
		if(n==0||n==1) {
			return n;
		}
		return f(n-1)+f(n-2);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(f(n));
	}
}
