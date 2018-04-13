package dp_etc;

import java.util.Scanner;

public class _1958 {
	static char[] x;
	static char[] y;
	static char[] z;
	static int[][][] d;
	static int go(int i, int j,int k) {
		if(i==0 || j==0 || k==0)return 0;
		if(d[i][j][k]>=0) return d[i][j][k];
		if(x[i]==y[j] && x[i]==z[k]) {
			d[i][j][k]=go(i-1,j-1,k-1)+1;
		}else {
			int tmp=Math.max(go(i-1,j,k), go(i,j-1,k));
			d[i][j][k]=Math.max(tmp, go(i,j,k-1));
		}
		return d[i][j][k];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = (" "+sc.next()).toCharArray();
		y = (" "+sc.next()).toCharArray();
		z = (" "+sc.next()).toCharArray();
		d = new int[x.length][y.length][z.length];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
				for(int k=0;k<z.length;k++) {
					d[i][j][k]=-1;
				}
			}
		}
		System.out.println(go(x.length-1,y.length-1,z.length-1));

	}

}