package dfs_bfs_etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2606 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int[][] a = new int[N+1][N+1];
		boolean[] visited = new boolean[N+1];
		int K= sc.nextInt();
		for(int k=0;k<K;k++) {
			int x= sc.nextInt();
			int y = sc.nextInt();
			a[x][y]=1;
			a[y][x]=1;
		}
		Queue<Integer> q = new LinkedList<Integer>();
		int cnt=0;
		q.add(1);
		visited[1]=true;
		while(!q.isEmpty()) {
			int now = q.poll();
			for(int i=1;i<=N;i++) {
				if(a[now][i]==1 && visited[i]!=true){
					q.add(i);
					visited[i]=true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
