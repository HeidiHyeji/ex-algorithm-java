package dp1;

import java.util.Scanner;

public class SumOfSquareNum1699 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] D = new int[N+1];
		for(int i=1;i<=N;i++) {
			D[i]=N+1;
			for(int j=1;j*j<=i;j++) {
				D[i]=Math.min(D[i], D[i-(j*j)]+1);
			}
		}
		System.out.println(D[N]);
	}
}
