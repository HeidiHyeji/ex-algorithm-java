package dp1;

import java.util.Scanner;

public class DecomposeSum2225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int mod=1000000000;
		long[][] D = new long[N+1][K+1];
		for(int i=0;i<=N;i++) {
			for(int j=1;j<=K;j++) {
				for(int l=0;l<=i;l++) {
					D[i][j]+=D[i-l][j-1];
					if(j==1)D[i][j]=1;
					D[i][j]%=mod;
				}
			}
		}
		System.out.println(D[N][K]);
	}
}
