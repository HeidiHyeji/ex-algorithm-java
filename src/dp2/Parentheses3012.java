package dp2;

import java.util.Scanner;

public class Parentheses3012 {
	static char[] open = { '(', '[', '{' };
	static char[] close = { ')', ']', '}' };
	static char[] a;
	static long[][] d;
	static boolean over=false;
	final static long mod=100000;
	 static long go(int i, int j) {
		 if(i>j) return 1;
		 if(d[i][j]!=-1) return d[i][j];
		 long ans=0;
		 for(int k=i+1;k<=j;k+=2) {
			 for(int l=0;l<3;l++) {
				 if(a[i]==open[l] || a[i]=='?') {
					 if(a[k]==close[l] || a[k]=='?') {
						 long tmp=go(i+1,k-1)*go(k+1,j);
						 if(ans+tmp>mod) {
							 over =true;
						 }
						 ans+=tmp;
						 ans%=mod;
					 }
				 }
			 }
		 }
		 return d[i][j]=ans;
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		a = sc.next().toCharArray();
		d = new long[N + 1][N + 1];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				d[i][j]=-1;
			}
		}
		long ans=go(0,N-1);
		if(over && ans>0) {
			System.out.printf("%05d",ans);
		}
		else {
			System.out.printf("%d",ans);
		}
	}

}
