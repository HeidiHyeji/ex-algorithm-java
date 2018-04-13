package dfs_bfs_etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _7576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();// ї­
		int N = sc.nextInt();// За
		int[][] a = new int[N][M];
		boolean[][] visited = new boolean[N][M];
		int[][] d = new int[N][M];
		int[] rx= {1,-1,0,0};
		int[] ry= {0,0,1,-1};
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				a[i][j] = sc.nextInt();
				d[i][j] = -1;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (a[i][j] == 1 && visited[i][j] != true) {
					Queue<Integer> q = new LinkedList<Integer>();
					int start = i * M + j;
					q.add(start);
					visited[i][j] = true;
					d[i][j] = 0;
					while(!q.isEmpty()) {
						int now=q.poll();
						for(int k=0;k<4;k++) {
							int ny=(now/M)+ry[k];
							int nx=(now%M)+rx[k];
							if(ny>=0 && ny<N && nx>=0 && nx<M) {
								if( a[ny][nx]==0) {
									if(visited[ny][nx]!=true) {
										q.add(ny*M+nx);
										visited[ny][nx]=true;
										d[ny][nx]=d[now/M][now%M]+1;
									}
									else if(d[ny][nx]>d[now/M][now%M]+1) {
										q.add(ny*M+nx);
//										visited[ny][nx]=true;
										d[ny][nx]=d[now/M][now%M]+1;
									}
								}

							}

						}
						
					}
				}
			}
		}
		int ans=-1;
		boolean all=true;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
//				System.out.print( d[i][j]);
				ans=Math.max(ans, d[i][j]);
				if(a[i][j]==0 && visited[i][j]!=true) {
					all=false;
				}
			}
//			System.out.println();
		}
		if(!all) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}

}
