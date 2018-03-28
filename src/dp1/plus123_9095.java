package dp1;

import java.util.Scanner;

public class plus123_9095 {
	static long[] D;

	static long cal(int x) {
		if (x == 1 || x == 2) return x;
		if (x == 3) return 4;
		if (D[x] > 0)
			return D[x];
		D[x] = cal(x - 1) + cal(x - 2)+ cal(x - 3);//1을 사용할 경우+2를 사용할 경우+3을 사용할 경우
		return D[x];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			D = new long[N + 1];
			System.out.println(cal(N));
		}

	}
}
