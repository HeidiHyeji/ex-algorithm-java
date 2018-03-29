package dp1;

import java.util.Scanner;

public class CrypticCode2011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mod=1000000;
		long[] d = new long[5001];
		d[0]=1;
		char[] s=(" "+sc.next()).toCharArray();
		int n= s.length;
		for(int i=1;i<n;i++) {
			int x = s[i]-'0';
			if(1<=x && x<=9) {
				d[i]=d[i-1]%mod;
			}
			if(i==1)continue;//i번째수를 한자리수로 해독
			if(s[i-1]=='0')continue;
			x=(s[i-1]-'0')*10+(s[i]-'0');//i번째수를 두자리수로 해독
			if(10<=x && x<=26) {
				d[i]=(d[i]+d[i-2])%mod;
			}
		}
		System.out.println(d[n-1]);
	}
}
