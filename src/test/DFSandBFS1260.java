package test;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class DFSandBFS1260 {
	static int N;
	static int M;
	static int[][] adj;
	static boolean[] visited;
	static String str;
	static Queue<Integer> q;
	static void dfs(int here) {
		visited[here]=true;
		str+=here+" ";
		for(int i=0;i<adj[here].length;i++) {
			if(adj[here][i] == 1 && visited[i]!=true) {
				dfs(i);
			}
		}
	}
	static void bfs(int start) {
		visited[start]=true;
		q.add(start);
		int here=0;
		while(!q.isEmpty()) {
			here = q.poll();
			str+=here+" ";
			for(int i=0;i<adj[here].length;i++) {
				if(adj[here][i]==1 && visited[i]!=true) {
					q.add(i);
					visited[i]=true;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();//정점
		M = sc.nextInt();//간선
		int V = sc.nextInt();//시작 정점
		adj = new int[N+1][N+1];
		visited = new boolean[N+1];
		str="";
		for(int i=0;i<M;i++) {//배열 초기화
			int x =sc.nextInt();
			int y = sc.nextInt();
			adj[x][y]=1;
			adj[y][x]=1;
		}
		dfs(V);
		System.out.println(str.trim());
		visited= new boolean[N+1];
		q = new LinkedList<Integer>();
		str="";
		bfs(V);
		System.out.println(str.trim());
	}
}
