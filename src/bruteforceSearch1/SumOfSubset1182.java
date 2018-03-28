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
		go(i+1,sum+a[i]);//i번째 원소를 부분집한에 포함할때
		go(i+1,sum);//i번째 원소를 부분집한에 포함하지 않을 때
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
		if(S==0) ans-=1;//공집합이 아닌 부분집합이므로 공집합일경우 하나를 뺀다
		System.out.println(ans);
	}
}
