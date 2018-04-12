package dp_etc;

import java.util.Scanner;

public class _1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] d0=new int[41];
		int[] d1=new int[41];
		d0[0]=1;
		d1[1]=1;
		for(int i=2;i<=40;i++) {
			d0[i]=d0[i-1]+d0[i-2];
			d1[i]=d1[i-1]+d1[i-2];
		}
		int T = sc.nextInt();	
		for(int t=0;t<T;t++) {
			int N =sc.nextInt();
			System.out.println(d0[N]+" "+d1[N]);
		}

	}
}
