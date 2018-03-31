package dp2;

import java.util.Arrays;
import java.util.Scanner;

public class Coin2_2294 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n+1];
		int d[]=new int[k+1];
		
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.fill(d, k+1);
		d[0]=0;
		for(int i=1;i<=n;i++) {//동전 반복
			for(int j=1;j<=k;j++) {
				if(j-a[i]>=0)
				d[j]=Math.min(d[j-a[i]]+1,d[j]);
			}
		}
		if(d[k]==k+1)System.out.println(-1);
		else System.out.println(d[k]);
	}
}
