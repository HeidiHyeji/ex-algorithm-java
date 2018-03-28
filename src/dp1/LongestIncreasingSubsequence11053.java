package dp1;
import java.util.Scanner;
public class LongestIncreasingSubsequence11053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[] D = new int[N+1];
		int[] D2 = new int[N+1];
		for(int i=1;i<=N;i++) {
			A[i]=sc.nextInt();
		}
		
		for(int i=1;i<=N;i++) {
			D[i]=1;//if에 만족하는 게 한번도 없더라도 수열의 길이는 1임
			for(int j=i-1;j>=1;j--) {
				if(A[i]>A[j] && D[i]<D[j]+1) {
					D[i]=D[j]+1;
				}
			}
		}
		int max=0;
		for(int i=N;i>=1;i--) {
			D2[i]=1;//if에 만족하는 게 한번도 없더라도 수열의 길이는 1임
			for(int j=i+1;j<=N;j++) {
				if(A[i]>A[j] && D2[i]<D2[j]+1) {
					D2[i]=D2[j]+1;
				}
			}
			max=Math.max(max, D[i]+D2[i]-1);
		}
		
		System.out.println(max);
	}
}
