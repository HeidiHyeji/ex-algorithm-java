package dp1;
import java.util.Scanner;
public class StairClimbing2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[][] D = new int[N+1][3];
		for(int i=1;i<=N;i++) {
			A[i]=sc.nextInt();
		}
		D[1][1]=A[1];
		D[1][2]=0;
		D[2][1]=A[2];
		D[2][2]=D[1][1]+A[2];
		for(int i=3;i<=N;i++) {
			D[i][1]=Math.max(D[i-2][1], D[i-2][2])+A[i];
			D[i][2]=D[i-1][1]+A[i];
		}
		System.out.println(Math.max(D[N][1], D[N][2]));
	}
}
