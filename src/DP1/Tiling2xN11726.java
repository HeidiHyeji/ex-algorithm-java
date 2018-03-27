package DP1;

import java.util.Scanner;

public class Tiling2xN11726 {
	static long[] D;

	static long cal(int x) {
		if (x == 1 || x == 2)
			return x;
		if (D[x] > 0)
			return D[x];
		D[x] = (cal(x - 1) + cal(x - 2)) % 10007;
		return D[x];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		D = new long[N + 1];
		System.out.println(cal(N));
	}
}
