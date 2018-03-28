package dp1;

import java.util.Scanner;

public class Bungeoppang11052 {
	static int N;
	static int[] D;
	static int[] p;
	static int cal(int x) {
		if(x==0) return 0;
		if(D[x]>0) return D[x];
		for(int i=1;i<=x;i++) {
			D[x]=Math.max(cal(x-i)+p[i],D[x]);
		}
		return D[x];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		D = new int[N + 1];
		p = new int[N + 1];
		for(int i=1;i<=N;i++) {
			 p[i] = sc.nextInt();
		}
		System.out.println(cal(N));
	}
}
