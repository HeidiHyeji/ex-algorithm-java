package dp1;

import java.util.Scanner;

public class Tiling2133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] D = new long[N+1];
		D[0]=1;
		for(int i=2;i<=N;i+=2) {
			D[i]=3*D[i-2];
			for(int j=i-4;j>=0;j-=2) {
				D[i]+=2*D[j];
			}
		}
		System.out.println(D[N]);
	}
}
