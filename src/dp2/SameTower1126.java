package dp2;

import java.util.Scanner;

public class SameTower1126 {
	static int a[];
	static int d[][];
	static int n;
	final static int inf = 10000000;

	static int go(int k, int diff) {
		if (diff > 250000)
			return -inf;//우선 순위를가장 낮추기 위해
		if (k == n) {
			if (diff == 0)
				return 0;
			else
				return -inf;
		}
		if (d[k][diff] != -1)
			return d[k][diff];
		int ans = Math.max(go(k + 1, diff), go(k + 1, diff + a[k]));
		if (a[k] > diff) {
			ans = Math.max(ans, diff + go(k + 1, a[k] - diff));
		} else {
			ans = Math.max(ans, a[k] + go(k + 1, diff - a[k]));
		}
		return d[k][diff] = ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		d = new int[50][250001];
		a = new int[50];
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 250001; j++) {
				d[i][j] = -1;
			}
		}
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int ans = go(0, 0);
		if (ans == 0)
			System.out.println(-1);
		else
			System.out.println(ans);
	}

}
