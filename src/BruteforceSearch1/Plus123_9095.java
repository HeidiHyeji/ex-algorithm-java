package BruteforceSearch1;

import java.util.Scanner;

public class Plus123_9095 {
	static int go(int count, int sum,int goal) {
		if(sum>goal) return 0;
		if(sum==goal) return 1;//작으면 자식 생성
		int now=0;
		for(int i=1;i<=3;i++) {
			now+=go(count+1,sum+i,goal);
		}
		return now;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int n = sc.nextInt();
			System.out.println(go(0,0,n));
		}
	}
	
}
