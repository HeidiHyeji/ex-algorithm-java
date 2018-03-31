package dp2;

import java.util.Scanner;
public class CombineFile11066 {
	static int k;
	static int n;
	static long d[][];
	static int a[];
	static long go(int i,int j) {//top-down
		if(i==j) return 0;
		if(d[i][j]!=-1)return d[i][j];
		int sum=0;
		for(int k=i;k<=j;k++ ) {
			sum+=a[k];
		}
		for(int k=i;k<=j-1;k++) {
			long tmp=go(i,k)+go(k+1,j)+sum;
			if(d[i][j]==-1) d[i][j]=tmp;
			else d[i][j]=Math.min(tmp, d[i][j]);
		}
		return d[i][j];
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			k=sc.nextInt();
			a=new int[k+1];
			d=new long[k+1][k+1];
			for(int i=1;i<=k;i++) {
				a[i]=sc.nextInt();
				for(int j=1;j<=k;j++) {
					d[i][j]=-1;
				}
			}
			System.out.println(go(1,k));
		}

	}
}