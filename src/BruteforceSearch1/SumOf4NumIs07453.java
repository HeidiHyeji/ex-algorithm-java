package BruteforceSearch1;

import java.util.Arrays;
import java.util.Scanner;
//이분탐색 http://12bme.tistory.com/120 ->값을 찾는 것보다 범위찾는것에 주목!
public class SumOf4NumIs07453 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		int[] D = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
			D[i] = sc.nextInt();
		}
		long[] first=new long[n*n];
		long[] second=new long[n*n];
		int k=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				first[k]=A[i] + B[j];
				second[k++]=C[i] + D[j];
			}
		}
		// 정렬하기
		Arrays.sort(second);

		long ans = 0;
		for (int i = 0; i < first.length; i++) {
			int left=0;int right=second.length;
			while(left<right) {//lower bound 구하기
				int mid=(left+right)/2;
				if(first[i]+second[mid]<0)left=mid+1;
				else right=mid;
			}
			long lower_bound =right;
			left=0;right=second.length;
			while(left<right) {//uppper bound 구하기
				int mid=(left+right)/2;
				if(first[i]+second[mid]<=0)left=mid+1;
				else right=mid;
			}
			long upper_bound =right;
			ans=ans+ upper_bound - lower_bound;
		}
		System.out.println(ans);
	}

}
