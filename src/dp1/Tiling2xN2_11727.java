package dp1;

import java.util.Scanner;

public class Tiling2xN2_11727 {
	static long[] D;

	static long cal(int x) {
		if (x == 1) return 1;
		if (x == 2) return 3;
		if (D[x] > 0)
			return D[x];
		D[x] = (cal(x - 1) + (cal(x - 2)*2)) % 10007;
		return D[x];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		D = new long[N + 1];
		System.out.println(cal(N));
	}
}
