package dp1;

import java.util.Scanner;

public class To1_1463 {
	static int[] D;
	static int cal(int x) {
		if(x==1) return 0;
		if(D[x]>0) return D[x];
		D[x]=cal(x-1)+1;
		if(x%3==0) {
			int tmp= cal(x/3)+1;
			if(D[x]>tmp) D[x]=tmp;
		}
		if(x%2==0) {
			int tmp= cal(x)+1;
			if(D[x]>tmp) D[x/3]=tmp;
		}
		return D[x];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		D = new int[N+1];
		
		System.out.println(cal(N));
	}
}
