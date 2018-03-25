package forfun;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci2747 {
	static BigInteger [] f;
	static BigInteger f(int n) {
		if(n==0||n==1) {
			return new BigInteger(n+"");
		}
		if(f[n]!=null) {
			return f[n];
		}
		return f[n]=f(n-1).add(f(n-2));
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		f=new BigInteger[n+1];
		System.out.println(f(n));
	}
}
