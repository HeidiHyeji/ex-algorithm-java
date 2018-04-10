package dp2;

import java.util.Scanner;

public class TileCode1720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] d = new long[N + 1];
		long[] a = new long[N + 1];
		a[1]=1;
		d[1]=1;
		if(N!=1) {
		a[2]=3;
		for(int i=3;i<=N;i++) {
			a[i]=a[i-1]+a[i-2]*2;
		}
		
		d[2]=3;
		for(int i=3;i<=N;i++) {
			long b=0;
			if(i%2==1) b=a[(i-1)/2];
			else b=2*a[(i-2)/2]+a[i/2];
			d[i]=(a[i]+b)/2;
		}
		}
		System.out.println(d[N]);
	}
}
