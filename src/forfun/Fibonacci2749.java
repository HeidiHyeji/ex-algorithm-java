package forfun;

import java.util.Scanner;
/**피사노 주기:피보나치 수를 M로 나눈 나머지의 주기
 * M=10^k일때 주기는 항상 15 × 10^(k-1)이다(단 k>2)
 * https://www.acmicpc.net/blog/view/28
**/
public class Fibonacci2749 {
	static int m = 1000000;
	static int p = 15*(m/10);
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long n = sc.nextLong();
		long[] f=new long[p];
		f[0]=0;f[1]=1;
		for(int i=2;i<p;i++) {
			f[i]=f[i-1]+f[i-2];
			f[i]%=m;
		}
		System.out.println(f[(int) (n%p)]);
	}
}
