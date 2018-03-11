package BruteforceSearch1;

import java.util.Arrays;
import java.util.Scanner;

public class TSP210971 {
	static int[] next_permutation(int[] A, int fromIdx) {
		int i = A.length - 1;
		while (i > fromIdx && A[i - 1] >= A[i])
			i--;// ���ٴ� ������ ������ �ߺ��� ���� ���� �� ���� ������ ����
		if (i <= fromIdx)
			return null;// ������ ������ ���
		int j = A.length - 1;
		while (j >= i && A[i - 1] >= A[j])
			j--;// ���ٴ� ������ ������ �ߺ��� ���� ���� �� ���� ������ ����
		int z = A[i - 1];
		A[i - 1] = A[j];
		A[j] = z;
		Arrays.sort(A, i, A.length);
		return A;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W[][] = new int[N][N];// ��� ���� �迭
		int d[] = new int[N];// �������� �迭
		for (int i = 0; i < N; i++) {// �迭 �ʱ�ȭ
			for (int j = 0; j < N; j++) {
				W[i][j] = sc.nextInt();
			}
			d[i] = i;
		}
		int min = 10000001;
		do {
			// ��뱸�ϱ�
			int sum = 0;
			boolean flag = true;
			for (int i = 0; i < N - 1; i++) {
				if (W[d[i]][d[i + 1]] == 0) {
					flag = false;// ���� ������ ����
					break;
				}
				sum += W[d[i]][d[i + 1]];
			}
			if (flag && W[d[N - 1]][d[0]] != 0) {
				sum += W[d[N - 1]][d[0]];// ������� �ǵ��ƿ���
				min = Math.min(min, sum);
			}
		} while ((d = next_permutation(d, 1)) != null);
		System.out.println(min);
		sc.close();
	}
}
