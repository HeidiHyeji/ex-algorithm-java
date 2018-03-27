package DP1;

import java.util.Scanner;
public class EasyNumOfSteps10844 {//Big Integer를 이용하면 mod는 결과 출력때 한번만 해도 된다!
	static long[][] D;
	static long cal(int n,int x) {
		if(n==1) return D[n][x];
		D[n][0]=cal(n-1,1)%1000000000;//D배열 자료형이 long인데 mod하지 않으면 시간초과
		D[n][9]=cal(n-1,8)%1000000000;
		for(int i=1;i<=8;i++) {
			D[n][i]=(cal(n-1,i-1)+cal(n-1,i+1))%1000000000;
		}
		return D[n][x];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		D=new long[N+1][10];
		D[1][0]=0;
		for(int i=1;i<10;i++) {
			D[1][i]=1;
		}
		long ans=0;//long인 것을 유의할것!int이면 틀림!
		for(int i=0;i<10;i++) {
			ans+=cal(N,i);
		}
		System.out.println(ans%1000000000);
	}
}