package dfs_bfs_etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _5014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int F = sc.nextInt();
		int S = sc.nextInt();
		int G = sc.nextInt();
		int U = sc.nextInt();
		int D = sc.nextInt();
		int[] ref= {U,-D};
		boolean[] visited = new boolean[F+1];
		int[] d = new int[F+1];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(S);
		d[S]=0;
		visited[S]=true;
		while(!q.isEmpty()) {
			int now=q.poll();
			for(int i=0;i<2;i++) {
				int next=now+ref[i];
				if(1<=next && next<=F) {
					if(visited[next]!=true) {
						q.add(next);
						d[next]=d[now]+1;
						visited[next]=true;
					}
				}
			}
		}
		if(visited[G]!=true) {
			System.out.println("use the stairs");
		}else {
			System.out.println(d[G]);
		}
		
	}
}
