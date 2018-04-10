package dp2;

import java.util.Scanner;

public class Skyscraper1328 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mod = 1000000007;
		int N = sc.nextInt();
		int L = sc.nextInt();
		int R = sc.nextInt();
		long d[][][] = new long[N + 1][L + 1][R + 1];
		d[1][1][1] = 1;
		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= L; j++) {
				for (int k = 1; k <= R; k++) {
					if (j + 1 <= L) {
						d[i + 1][j + 1][k] += d[i][j][k];
						d[i + 1][j + 1][k] %= mod;
					}
					if (k + 1 <= R) {
						d[i + 1][j][k + 1] += d[i][j][k];
						d[i + 1][j][k + 1] %= mod;
					}

					d[i + 1][j][k] += d[i][j][k] * (i - 1);
					d[i + 1][j][k] %= mod;
				}
			}
		}
		System.out.println(d[N][L][R]);
	}

}
