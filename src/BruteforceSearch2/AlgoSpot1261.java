package BruteforceSearch2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class AlgoSpot1261 {
	static int[][] a;
	static int[][] d;
	static Deque<Integer[]> dq;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();// 가로
		int N = sc.nextInt(); // 세로
		dq = new LinkedList<Integer[]>();
		a = new int[N][M];
		d = new int[N][M];
		for (int r = 0; r < N; r++) {
			String s = sc.next();
			for (int c = 0; c < M; c++) {
				a[r][c] = Integer.parseInt(s.charAt(c) + "");
				 d[r][c]=-1;
			}
		}
		Integer[] start = { 0, 0 };
		dq.addFirst(start);
		d[0][0]=0;
		while (!dq.isEmpty()) {
			Integer[] now = dq.poll();
			int x = now[0];
			int y = now[1];
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];// 다음 노드
				int ny = y + dy[k];
				Integer[] next = { nx, ny };
				if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
					if (d[nx][ny] ==-1) {// 방문한 적 없으면
						if (a[nx][ny] == 0) {// 가중치가 0이면
							d[nx][ny] = d[x][y];
							dq.addFirst(next);//앞의 덱에
						} else {//가중치가 1이면
							d[nx][ny] = d[x][y] + 1;
							dq.addLast(next);//뒤의 덱에
						}
					}
				}
			}
		}
		System.out.println(d[N - 1][M - 1]);
	}
}
