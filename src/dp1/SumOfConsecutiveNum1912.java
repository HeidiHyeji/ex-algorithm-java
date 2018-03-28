package dp1;
import java.util.Scanner;
public class SumOfConsecutiveNum1912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[] D = new int[N+1];
		for(int i=1;i<=N;i++) {
			A[i]=sc.nextInt();
		}
		int max=D[1]=A[1];

		for(int i=2;i<=N;i++) {
			D[i]=Math.max(D[i-1]+A[i],A[i]);//연속하기,안하기
			max=Math.max(max, D[i]);
		}
		
		System.out.println(max);
	}
}
