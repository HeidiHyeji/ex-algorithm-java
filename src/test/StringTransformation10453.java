package test;

import java.util.Scanner;

public class StringTransformation10453 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int cnt = 0;
			String A = sc.next();
			String B = sc.next();

			char[] strA = A.toCharArray();
			char[] strB = B.toCharArray();
			int n=Math.max(strA.length,strA.length);
			int[] cntA=new int[n];
			int[] cntB=new int[n];
			int a=0;
			int b=0;
			int sum=0;
			for(int i=0;i<n;i++) {
				if(strA[i]=='b') {
					cntA[a]=i;
					a++;
				}
				if(strB[i]=='b') {
					cntB[b]=i;
					b++;
				}
			}
			for(int i=0;i<n;i++) {
				sum+=Math.abs(cntA[i]-cntB[i]);
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
