package dp_etc;

import java.util.Scanner;

public class _9251 {
	static char[] x;
	static char[] y;
	static int[][] d;
	static int go(int i, int j) {
		if(i==0 || j==0)return 0;
		if(d[i][j]>=0) return d[i][j];
		if(x[i]==y[j]) {
			d[i][j]=go(i-1,j-1)+1;
		}else {
			d[i][j]=Math.max(go(i-1,j), go(i,j-1));
		}
		return d[i][j];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = (" "+sc.next()).toCharArray();
		y = (" "+sc.next()).toCharArray();
		d = new int[x.length][y.length];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
				d[i][j]=-1;
				
			}
		}
		System.out.println(go(x.length-1,y.length-1));

	}

}