package forfun;

import java.util.Scanner;

public class RGBDistance1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A=new int[N+1][3];
		long[][] d=new long[N+1][3];
		
		for(int i=1;i<=N;i++) {//ÃÊ±âÈ­
			for(int j=0;j<3;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		d[1][0]=A[1][0];
		d[1][1]=A[1][1];
		d[1][2]=A[1][2];
		for(int i=2;i<=N;i++) {
			d[i][0]=Math.min(d[i-1][1], d[i-1][2])+A[i][0];
			d[i][1]=Math.min(d[i-1][0], d[i-1][2])+A[i][1];
			d[i][2]=Math.min(d[i-1][0], d[i-1][1])+A[i][2];
		}
		long min=Math.min(d[N][0], d[N][1]);
		min=Math.min(d[N][2], min);
		
		System.out.println(min);
	}

}
