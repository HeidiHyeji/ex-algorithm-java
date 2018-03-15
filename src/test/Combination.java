package test;
import java.util.Scanner;
public class Combination {
	static int combination(int n, int r) {
		if(n==r || r==0) {
			return 1;
		}
			return combination(n-1,r-1)+combination(n-1,r);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(combination(n,r));//조합
		System.out.println(combination(n+r-1,r));//중복조합
	}
}
