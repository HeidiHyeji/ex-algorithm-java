package bruteforceSearch1;

import java.util.Scanner;

public class SumOfSubset1182 {
	static int[] a;
	static int N;
	static int S;
	static int ans=0;
	static void go(int i,int sum) {
		if(i==N) {
			if(sum==S) {
				ans++;
			}
			return;
		}
		go(i+1,sum+a[i]);//i��° ���Ҹ� �κ����ѿ� �����Ҷ�
		go(i+1,sum);//i��° ���Ҹ� �κ����ѿ� �������� ���� ��
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		a = new int[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		go(0,0);
		if(S==0) ans-=1;//�������� �ƴ� �κ������̹Ƿ� �������ϰ�� �ϳ��� ����
		System.out.println(ans);
	}
}
