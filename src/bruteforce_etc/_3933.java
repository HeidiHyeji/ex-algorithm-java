package bruteforce_etc;

import java.util.Scanner;

public class _3933 {
	final static int max = (int) Math.pow(2, 15);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[max];
		while (true) {
			int N = sc.nextInt();
			if (N == 0)
				break;
			if (a[N] != 0)
				System.out.println(a[N]);
			else {
				int cnt = 0;
				for (int i = 0; i * i <= N; i++) {
					for (int j = i; j * j <= N; j++) {
						for (int k = j; k * k <= N; k++) {
							for (int l = k; l * l <= N; l++) {
								if (i * i + j * j + k * k + l * l == N)
									cnt++;
							}
						}
					}
				}
				a[N] = cnt;
				System.out.println(cnt);
			}
		}
	}

}
