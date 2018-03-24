package BruteforceSearch2;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfPrimeNumber1644 {
	static int N;
	static int[] pn;
	static Integer [] a;
	static int Max;
	static void chkPrimeNumber() {//값이 0이 아니면 소수(1은소수가 아니다)	
		for(int i=2;i<=N;i++) {
			pn[i]=i;
		}
		for(int i=2;i*i<=N;i++) {
			if(pn[i]==0) {
				continue;
			}
			for(int j=i+i;j<=N;j+=i) {
				pn[j]=0;
			}
		}
		ArrayList<Integer> tmp=new ArrayList<Integer>();
		for(int i=2;i<N+1;i++) {//소수 배열을 일반 배열로 옮긴다
			if(pn[i]!=0) {
				tmp.add(i);
			}
		}
		Max=tmp.size();
		a=tmp.toArray(new Integer[Max+1]);
		a[Max]=0;//main의 while문의 마지막을 위해
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		pn = new int[N+1];
		chkPrimeNumber();
		int left=0;int right=0;
		int sum=a[0];
		int ans=0;
		while(left<=right && right<Max) {
			if(sum<N) {
				right++;
				sum+=a[right];
			}else if(sum==N) {
				ans++;
				right++;
				sum+=a[right];
			}else {
				sum-=a[left];
				left++;
				if(left>right && left<Max) {
					right=left;
					sum=a[left];
				}
			}
		}
		System.out.println(ans);
	}

}
