package dp_etc;

import java.util.Scanner;

public class _10211 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			int N =sc.nextInt();
			int[] a = new int[N+1];
			int[] d = new int[N+1];
			for(int i=1;i<=N;i++) {
				a[i]=sc.nextInt();
			}
			int max=-1000000;
			for(int i=1;i<=N;i++) {
				d[i]=Math.max(d[i-1]+a[i],a[i]);
				max=Math.max(max, d[i]);
			}
			System.out.println(max);
		}
		

	}

}
