package dp2;

import java.util.Scanner;

public class Jump1890 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] a= new int[N+1][N+1];
		long[][] d= new long[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=N;i>=1;i--) {
			for(int j=N;j>=1;j--) {
				if(j+a[i][j]<=N)
					d[i][j]+=d[i][j+a[i][j]];
				if(i+a[i][j]<=N)
					d[i][j]+=d[i+a[i][j]][j];
				if(i==N && j==N)d[i][j]=1;
			}
		}
		System.out.println(d[1][1]);
	}
}