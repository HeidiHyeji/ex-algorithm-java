package dp_etc;

import java.util.Scanner;

public class _5582 {
	static char[] x;
	static char[] y;
	static int[][] d;
	static int go(int i, int j) {
		if(i==0 || j==0)return 0;
		if(d[i][j]>=0) return d[i][j];
		if(y[i]==x[j]) {
			d[i][j]=go(i-1,j-1)+1;
		}else {
			d[i][j]=0;		
		}
		go(i-1,j);go(i,j-1);//조건문 밖으로 빼야 전부탐색 할수 있다
		return d[i][j];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		y = (" "+sc.next()).toCharArray();
		x = (" "+sc.next()).toCharArray();
		d = new int[y.length][x.length];
		for(int i=0;i<y.length;i++) {
			for(int j=0;j<x.length;j++) {
				d[i][j]=-1;
			}
		}
		go(y.length-1,x.length-1);
		int ans=0;
		for(int i=0;i<y.length;i++) {
			for(int j=0;j<x.length;j++) {
				ans=Math.max(ans,d[i][j]);
			}
		}
		System.out.println(ans);
	}
}