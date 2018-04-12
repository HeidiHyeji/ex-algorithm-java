package dp_etc;

import java.util.Scanner;

public class _1932 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a= new int[n+1][n+1];
		int[][] d= new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
			a[i][j]=sc.nextInt();
		}
		d[1][1]=a[1][1];
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				d[i][j]=Math.max(d[i-1][j-1], d[i-1][j])+a[i][j];
			}
		}
		int max=0;
		for(int j=1;j<=n;j++) {
			max=Math.max(max, d[n][j]);
		}
		System.out.println(max);
	}

}
