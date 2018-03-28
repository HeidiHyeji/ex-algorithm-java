package dp1;

import java.util.Scanner;

public class ASENum11057 {
	static long[][] D;

	static long cal(int n, int x) {
		if (n == 1 || D[n][x] > 0)
			return D[n][x];
		long tmp =  0;
		for (int j = 0; j <= x; j++) {
			tmp += cal(n - 1, j);
			D[n][x] = tmp % 10007;
		}
		return D[n][x];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		D = new long[N + 1][10];
		D[1][0] = 0;
		for (int i = 0; i < 10; i++) {
			D[1][i] = 1;
		}
		long ans = 0;
		for (int i = 0; i < 10; i++) {
			ans += cal(N, i);
		}
		System.out.println(ans % 10007);
	}
}