package dp1;

import java.util.Scanner;

public class PadovanSequence9461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			long[] D = new long[N + 5];
			D[1] = 1; D[2] = 1; D[3] = 1; D[4] = 2; D[5] = 2;
			for (int i = 6; i <= N; i ++) {
				D[i]=D[i-1]+D[i-5];
			}
			System.out.println(D[N]);
		}
	}
}
