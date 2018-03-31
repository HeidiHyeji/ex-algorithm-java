package dp2;

import java.util.Scanner;
public class DownhillLoad1520 {
	static int m;
	static int n;
	static long d[][];
	static int a[][];
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	static long go(int x,int y) {//top-down
		if(x==m && y==n)return 1;
		if(d[x][y]>=0) return d[x][y];
		if(d[x][y]==-1)d[x][y]=0;//메모리제함
		for(int k=0;k<4;k++) {
			int nx=x+dx[k];
			int ny=y+dy[k];
			if(0<nx && nx<=m && 0<ny && ny<=n) {
				if(a[x][y]>a[nx][ny]) { 
					d[x][y]+=go(nx,ny);
				}
			}
		}
		return d[x][y];
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		a=new int[m+1][n+1];
		d=new long[m+1][n+1];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				a[i][j]=sc.nextInt();
				d[i][j]=-1;//-1로 초기화하지 않으면 메모리제이션에서 문제가 발생함 
				//경우의 수가 0인경우를 저장하지 못하고 재탐색하여 시간초과를 유발
			}
		}
		System.out.println(go(1,1));
	}
}