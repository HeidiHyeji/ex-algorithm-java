package dp2;

import java.util.Scanner;

public class DivideSection2228 {
	static boolean[][] c;
	static long[][] d;
	static int[] s;
	static long go(int n, int m) {
		if(m==0) return 0;
		if(n<=0) return -32769*100;
		if(c[n][m]==true) return d[n][m];
		c[n][m]=true;
		d[n][m]=go(n-1,m);
		for(int k=1;k<=n;k++) {
			d[n][m]=Math.max(d[n][m],go(k-2,m-1)+(s[n]-s[k-1]));
		}
		return d[n][m];
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int m =sc.nextInt();
		s = new int[n+1];
		c = new boolean[n+1][m+1];
		d = new long[n+1][m+1];
		for(int i=1;i<=n;i++) {
			s[i]=s[i-1]+sc.nextInt();
		}
		System.out.println(go(n,m));
	}
}
