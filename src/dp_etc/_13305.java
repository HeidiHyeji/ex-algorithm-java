package dp_etc;

import java.util.Scanner;

public class _13305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] x= new long[N+1];
		long[] mx= new long[N+1];//1부터 i까지중 min
		long[] di= new long[N+1];
		long[] dp= new long[N+1];
		for(int i=1;i<N;i++) {
			di[i]=sc.nextInt();
		}
		long min=1000000001;
		for(int i=1;i<=N;i++) {
			x[i] = sc.nextInt();
			min=Math.min(min, x[i]);
			mx[i]=min;
		} 
		for(int i=1;i<=N;i++) {
			dp[i]=dp[i-1]+di[i-1]*mx[i-1];
		}
		System.out.println(dp[N]);
	}

}
