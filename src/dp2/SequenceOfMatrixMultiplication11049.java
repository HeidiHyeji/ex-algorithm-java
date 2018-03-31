package dp2;

import java.util.Scanner;

public class SequenceOfMatrixMultiplication11049 {
	static int n;
	static long d[][];
	static int a[][];

	static long go(int i, int j) {// top-down
		if (i == j) return 0;
		if (d[i][j] != -1) return d[i][j];
		int mul = 1;
		for (int k = i; k <= j - 1; k++) {	
			mul =a[i][1]*a[k][2]*a[j][2];
			long tmp = go(i, k) + go(k + 1, j) + mul;
			if (d[i][j] == -1)
				d[i][j] = tmp;
			else
				d[i][j] = Math.min(tmp, d[i][j]);
		}
		return d[i][j];

	}
//	System.out.println(k+"-"+i+","+j+":"+d[i][j]);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n + 1][3];
		d = new long[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			a[i][1] = sc.nextInt();
			a[i][2] = sc.nextInt();
			for (int j = 1; j <= n; j++) {
				d[i][j] = -1;
			}
		}
		System.out.println(go(1, n));
	}
}