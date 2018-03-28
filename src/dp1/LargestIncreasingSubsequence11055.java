package dp1;
import java.util.Scanner;
public class LargestIncreasingSubsequence11055 {

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
			D[i]=A[i];//if에 만족하는 게 한번도 없더라도 크기는 자기자신 A[i]임
			for(int j=i-1;j>=1;j--) {
				if(A[i]>A[j] && D[i]<D[j]+A[i]) {
					D[i]=D[j]+A[i];
				}
			}
			max=Math.max(max, D[i]);
		}
		System.out.println(max);
	}
}
