package DP1;

import java.util.Scanner;
public class EasyNumOfSteps10844 {//Big Integer�� �̿��ϸ� mod�� ��� ��¶� �ѹ��� �ص� �ȴ�!
	static long[][] D;
	static long cal(int n,int x) {
		if(n==1) return D[n][x];
		D[n][0]=cal(n-1,1)%1000000000;//D�迭 �ڷ����� long�ε� mod���� ������ �ð��ʰ�
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
		long ans=0;//long�� ���� �����Ұ�!int�̸� Ʋ��!
		for(int i=0;i<10;i++) {
			ans+=cal(N,i);
		}
		System.out.println(ans%1000000000);
	}
}