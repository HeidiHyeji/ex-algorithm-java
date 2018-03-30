package dp2;

import java.util.Scanner;

public class PalindromeDivision1509 {
	static char[] a;
	static int[][] c;
	static int go(int i,int j) {
		if(i>j) return 0;
		if(i==j) return c[i][j]=1;//길이 1
		else if(i+1==j) {//길이 2
			if(a[i]==a[j])return c[i][j]=1;
			else return c[i][j]=0;
		}
		if(c[i][j]>=0) return c[i][j];
		if(a[i]!=a[j])return c[i][j]=0;
		else return c[i][j]=go(i+1,j-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a= (" "+sc.next()).toCharArray();
		int N = a.length-1;
		c= new int[N+1][N+1];
		int[] d=new int[N+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				c[i][j]=-1;
			}
		}
		d[0]=0;
		for(int i=1;i<=N;i++) {
			d[i]=-1;
			for(int j=1;j<=i;j++) {
				if(go(j,i)==1) {
					if(d[i]==-1||d[i]>d[j-1]+1) {
						
						d[i]=d[j-1]+1;
					}
				}
				
			}
		}
		System.out.println(d[N]);
	}
}