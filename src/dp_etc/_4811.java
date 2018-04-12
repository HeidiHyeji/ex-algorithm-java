package dp_etc;

import java.util.Scanner;

public class _4811 {
	final static int num=31;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[][] d = new long[num][num];
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==0 && j>0) d[i][j]=1;
				else if(i!=0){
					if(j-1>=0) d[i][j]+=d[i][j-1];
					if(j+1<num) d[i][j]+=d[i-1][j+1];
				}
			}
		}
		while(true) {
			int N = sc.nextInt();
			if(N==0) break;
			System.out.println(d[N][0]);
		}
	}
}
