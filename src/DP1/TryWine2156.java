package DP1;

import java.util.Scanner;

public class TryWine2156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N + 1];
		int[] d = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		d[1] = a[1];
		if(N==1) {System.out.println(d[1]);return;}
		d[2] = a[1] + a[2];
		if(N==2) {System.out.println(d[2]);return;}				
		for (int i = 3; i <= N; i++) {
			d[i] = Math.max(d[i - 1], d[i - 2] + a[i]);
			d[i] = Math.max(d[i], d[i - 3] + a[i] + a[i - 1]);
		}
		System.out.println(d[N]);
	}

}
