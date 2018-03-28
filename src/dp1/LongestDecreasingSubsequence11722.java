package dp1;
import java.util.Scanner;
public class LongestDecreasingSubsequence11722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[] D = new int[N+1];
		for(int i=1;i<=N;i++) {
			A[i]=sc.nextInt();
		}
		int max=D[1]=1;
		for(int i=2;i<=N;i++) {
			D[i]=1;//if에 만족하는 게 한번도 없더라도 수열의 길이는 1임
			for(int j=i-1;j>=1;j--) {
				if(A[i]<A[j] && D[i]<D[j]+1) {
					D[i]=D[j]+1;
				}
			}
			max=Math.max(max, D[i]);
		}
		System.out.println(max);
	}
}
