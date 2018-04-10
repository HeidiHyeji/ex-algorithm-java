package dp2;
import java.util.Scanner;
public class Guitarist1495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		int[][] d = new int[N+1][M+1];
		int[] v = new int[N+1];
		for(int i=1;i<=N;i++) {
			v[i]=sc.nextInt();
		}		
		d[0][S]=1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<=M;j++) {
				if(d[i][j]==1) {
					if(j+v[i+1]<=M) d[i+1][j+v[i+1]]=1;
					if(j-v[i+1]>=0) d[i+1][j-v[i+1]]=1;
				}
			}
		}
		for(int i=M;i>=0;i--) {
			if(d[N][i]==1) {
				System.out.println(i);
				break;
			}
			if(i==0)
				System.out.println(-1);
		}
	}

}
