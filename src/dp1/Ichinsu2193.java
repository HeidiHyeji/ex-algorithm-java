package dp1;
import java.util.Scanner;
public class Ichinsu2193 {
	static long[] D;
	static long cal(int n) {
		if(n==1||n==2) return 1;
		if(D[n]>0) return D[n];
		D[n]=cal(n-1)+cal(n-2);
		return D[n];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		D=new long[N+1];
		System.out.println(cal(N));
	}
}
