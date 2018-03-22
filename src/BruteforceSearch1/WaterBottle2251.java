package BruteforceSearch1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WaterBottle2251 {
	static Queue<ArrayList<Integer>> q;
	static boolean[][] visited;
	static boolean[] ans;
	static ArrayList<Integer> pour(int nx,int ny,int F) {
		ny = nx + ny;
		nx = 0;
		if (ny > F) {
			nx = ny - F;
			ny = F;
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(nx);
		res.add(ny);
		return res;
	}
	static void bfs(int na,int nb, int nc) {
		if (!visited[na][nb]) {
			ArrayList<Integer> next = new ArrayList<Integer>();
			next.add(na);
			next.add(nb);
			q.add(next);
			visited[na][nb] = true;
			if (na==0) {
				ans[nc] = true;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		q = new LinkedList<ArrayList<Integer>>();
		visited = new boolean[201][201]; // C=C-A-B이므로 A와 B의 상태만 저장한다
		ans = new boolean[201];

		int a = 0;
		int b = 0;
		int c = C;
		ArrayList<Integer> start = new ArrayList<Integer>();
		start.add(a);
		start.add(b);
		q.add(start);
		visited[a][b] = true;
		ans[c] = true;
		ArrayList<Integer> tmp= new ArrayList<Integer>();
		int na;int nb;int nc;
		while (!q.isEmpty()) {
			ArrayList<Integer> now = q.poll();
			a = now.get(0);
			b = now.get(1);
			c = C - (a + b);
			
			// a->b
			tmp=pour(a,b,B);
			na=tmp.get(0);
			nb=tmp.get(1);
			nc=C-na-nb;
			bfs(na,nb,nc);
			//a->c
			tmp=pour(a,c,C);
			na=tmp.get(0);
			nc=tmp.get(1);
			nb=C-na-nc;
			bfs(na,nb,nc);			
			//b->a
			tmp=pour(b,a,A);
			nb=tmp.get(0);
			na=tmp.get(1);
			nc=C-nb-na;
			bfs(na,nb,nc);
			//b->c
			tmp=pour(b,c,C);
			nb=tmp.get(0);
			nc=tmp.get(1);
			na=C-nb-nc;
			bfs(na,nb,nc);
			//c->a
			tmp=pour(c,a,A);
			nc=tmp.get(0);
			na=tmp.get(1);
			nb=C-nc-na;
			bfs(na,nb,nc);
			//c->b
			tmp=pour(c,b,B);
			nc=tmp.get(0);
			nb=tmp.get(1);
			na=C-nc-nb;
			bfs(na,nb,nc);

		}
		for(int i=0;i<ans.length;i++) {
			if(ans[i]) {
				System.out.print(i+" ");
			}
		}

	}
}
