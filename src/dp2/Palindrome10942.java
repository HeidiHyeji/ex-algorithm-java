package dp2;

import java.util.Scanner;

public class Palindrome10942 {
	static int[] a;
	static int[][] d;
	static int go(int i,int j) {
		if(i==j) return 1;//길이 1
		else if(i+1==j) {//길이 2
			if(a[i]==a[j])return 1;
			else return 0;
		}
		if(d[i][j]>=0) return d[i][j];
		if(a[i]!=a[j])return d[i][j]=0;
		else return d[i][j]=go(i+1,j-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		a= new int[N+1];
		d= new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			a[i]=sc.nextInt();
			for(int j=1;j<=N;j++) {
				d[i][j]=-1;
			}
		}
		int M = sc.nextInt();
		for(int m=0;m<M;m++) {
			System.out.println(go(sc.nextInt(),sc.nextInt()));
		}
	}
}