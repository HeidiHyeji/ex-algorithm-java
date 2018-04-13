package dp_etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _9252 {
	static char[] x;
	static char[] y;
	static int[][] d;
	static int[][] a;
	static int go(int i, int j) {
		if(i==0 || j==0)return 0;
		if(d[i][j]>=0) return d[i][j];
		if(y[i]==x[j]) {
			a[i][j]=1;
			d[i][j]=go(i-1,j-1)+1;
		}else {
			d[i][j]=Math.max(go(i-1,j), go(i,j-1));
		}
		return d[i][j];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		y = (" "+sc.next()).toCharArray();//За
		x = (" "+sc.next()).toCharArray();//ї­
		int N=y.length;
		int M=x.length;
		d = new int[N][M];
		a = new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				d[i][j]=-1;
				
			}
		}
		int ans=go(N-1,M-1);
		System.out.println(ans);
		int ny=N-1;
		int nx=M-1;
		String str="";
		int cnt=0;
		while(cnt!=ans) {
			if(a[ny][nx]==1) {
				cnt++;
				str=y[ny]+str;
				ny=ny-1;
				nx=nx-1;
			}else if(d[ny][nx]==d[ny-1][nx]){
				ny=ny-1;
			}else if(d[ny][nx]==d[ny][nx-1]){
				nx=nx-1;
			}
		}
		System.out.println(str);
	}

}