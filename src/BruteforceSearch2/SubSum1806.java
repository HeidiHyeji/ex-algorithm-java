package BruteforceSearch2;

import java.util.Scanner;

public class SubSum1806 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] a = new int[N + 1];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int right=0,left=0;
		int len=1,min=N+1;
		int sum=a[0];
		while(right<N && left<=right) {
			if(sum<S) {
				right++;
				len++;
				sum+=a[right];
			}else {
				if(min>len)min=len;
				sum-=a[left];
				len--;	
				left++;						
				if(left>right && left<N) {
					right=left;
					sum=a[left];
					len=1;
				}
			}
		}
	   if(min==N+1){
            System.out.println(0);
        }else{
            System.out.println(min);
        }
	}
}
