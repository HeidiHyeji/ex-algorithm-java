package bruteforce_etc;

import java.util.Scanner;

public class _1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N==1000)N--;
		if(N<100) {
			System.out.println(N);
			return;
		}else {
			int ans=0;
			for(int i=100;i<=N;i++) {//모든수는 세자리수
				int k=i;
				char[] a= (k+"").toCharArray();
				if(a[2]-a[1]==a[1]-a[0]) ans++;
			}
			System.out.println(ans+99);
		}
	}
}
