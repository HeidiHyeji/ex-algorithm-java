package BruteforceSearch1;

import java.util.Arrays;
import java.util.Scanner;

public class TSP210971 {
	static int[] next_permutation(int[] A, int fromIdx) {
		int i = A.length - 1;
		while (i > fromIdx && A[i - 1] >= A[i])
			i--;// 같다는 조건이 없으면 중복된 수가 있을 때 무한 루프에 빠짐
		if (i <= fromIdx)
			return null;// 마지막 순열일 경우
		int j = A.length - 1;
		while (j >= i && A[i - 1] >= A[j])
			j--;// 같다는 조건이 없으면 중복된 수가 있을 때 무한 루프에 빠짐
		int z = A[i - 1];
		A[i - 1] = A[j];
		A[j] = z;
		Arrays.sort(A, i, A.length);
		return A;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W[][] = new int[N][N];// 비용 담을 배열
		int d[] = new int[N];// 순열담을 배열
		for (int i = 0; i < N; i++) {// 배열 초기화
			for (int j = 0; j < N; j++) {
				W[i][j] = sc.nextInt();
			}
			d[i] = i;
		}
		int min = 10000001;
		do {
			// 비용구하기
			int sum = 0;
			boolean flag = true;
			for (int i = 0; i < N - 1; i++) {
				if (W[d[i]][d[i + 1]] == 0) {
					flag = false;// 갈수 없으면 종료
					break;
				}
				sum += W[d[i]][d[i + 1]];
			}
			if (flag && W[d[N - 1]][d[0]] != 0) {
				sum += W[d[N - 1]][d[0]];// 출발지로 되돌아오기
				min = Math.min(min, sum);
			}
		} while ((d = next_permutation(d, 1)) != null);
		System.out.println(min);
		sc.close();
	}
}
