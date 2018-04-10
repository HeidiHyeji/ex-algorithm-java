package dp2;
import java.util.Scanner;
public class Freshman5557 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[][] d = new long[N+1][21];
		int[] v = new int[N+1];
		for(int i=1;i<=N;i++) {
			v[i]=sc.nextInt();
		}		
		d[1][v[1]]=1;
		for(int i=1;i<N-1;i++) {
			for(int j=0;j<=20;j++) {
				if(d[i][j]!=0) {
					if(j+v[i+1]<=20) d[i+1][j+v[i+1]]+=d[i][j];
					if(j-v[i+1]>=0) d[i+1][j-v[i+1]]+=d[i][j];
				}
			}
		}
		System.out.println(d[N-1][v[N]]);
	}

}
