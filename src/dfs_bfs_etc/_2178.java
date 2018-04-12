package dfs_bfs_etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] a = new int[N][M];
		long[][] d = new long[N][M];
		boolean[][] visited = new boolean[N][M];
		int[] ref= {1,-1,M,-M};
		for(int i=0;i<N;i++) {
			String str=sc.next();
			for(int j=0;j<M;j++) {
				a[i][j]=str.charAt(j)-'0';
				visited[i][j]=false;
				d[i][j]=0;
			}
		}
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(0);
		visited[0][0]=true;
		d[0][0]=1;
		while(!q.isEmpty()) {
			int now=q.poll();
			int x=now/M;
			int y=now%M;
			long nowD=d[x][y];
			for(int i=0;i<4;i++) {
				if(i==0 && y==M-1) continue;
				if(i==1 && y==0) continue;
				int next=now+ref[i];
				if(next>=0 && next<N*M) {
					int nx=next/M;
					int ny=next%M;
					if(a[nx][ny]==1 && visited[nx][ny]!=true) {
						q.add(next);
						visited[nx][ny]=true;
						d[nx][ny]=nowD+1;
					}
				}
			}
		}
		System.out.println(d[N-1][M-1]);
	}

}
