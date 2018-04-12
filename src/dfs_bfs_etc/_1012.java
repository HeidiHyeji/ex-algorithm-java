package dfs_bfs_etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] xp = { 1, -1, 0, 0 };
		int[] yp = { 0, 0, 1, -1 };
		for (int t = 0; t < T; t++) {
			int M = sc.nextInt();// ї­
			int N = sc.nextInt();// За

			int[][] a = new int[N][M];
			boolean[][] visited = new boolean[N][M];
			Queue<Integer> q = new LinkedList<Integer>();
			int K = sc.nextInt();
			for (int k = 0; k < K; k++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				a[y][x] = 1;
			}
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (a[i][j] == 1 && visited[i][j] != true) {
						int start = i * M + j;
						q.add(start);
						visited[i][j] = true;
						while (!q.isEmpty()) {
							int now = q.poll();
							for (int k = 0; k < 4; k++) {
								int ny = (now / M) + yp[k];
								int nx = (now % M) + xp[k];
								if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
									if (a[ny][nx] == 1 && visited[ny][nx] != true) {
										q.add(ny * M + nx);
										visited[ny][nx] = true;
									}
								}
							}

						}
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}

	}

}
