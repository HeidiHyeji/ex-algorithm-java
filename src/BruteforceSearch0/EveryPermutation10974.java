package BruteforceSearch0;

import java.util.Arrays;
import java.util.Scanner;

public class EveryPermutation10974 {
	static void toString(int[] arr) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i] + " ";
		}
		System.out.println(str.trim());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {// 배열 초기화
			arr[i] = i + 1;
		}
		/* 다음 순열 */
		while (true) {
			int idx = N - 1;
			while (idx >= 1 && arr[idx - 1] >= arr[idx])
				idx--;
			if (idx == 0) {// 마지막 순열
				toString(arr);
				break;
			} else {
				toString(arr);
				int next = N - 1;
				while (next >= idx && arr[idx - 1] >= arr[next])
					next--;
				int z = arr[idx - 1];// swap
				arr[idx - 1] = arr[next];
				arr[next] = z;

				Arrays.sort(arr, idx, N);
				
			}
		}
	}
}
