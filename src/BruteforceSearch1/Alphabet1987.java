package BruteforceSearch1;

import java.util.Scanner;

public class Alphabet1987 {
	static int R;
	static int C;
	static char[][] board;
	static boolean[] check;//A~Z=65~90->26개
	static int[] dr = { 1, -1, 0, 0 };// 상하좌우
	static int[] dc = { 0, 0, -1, 1 };

	static int go(int row,int col) {
		int ans=0;
		for(int k=0;k<4;k++) {
			int nr=row+dr[k];//현재 위치의 상하좌우 탐색
			int nc=col+dc[k];
			if(nr>=0 && nr<R && nc>=0 && nc<C) {
				if(!check[board[nr][nc]-'A']) {//지나간 알파벳이 아니라면
					check[board[nr][nc]-'A']=true;
					int next=go(nr,nc);
					if(ans<next) ans=next;
					check[board[nr][nc]-'A']=false;
				}	
			}
		}
		return ans+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		board = new char[R][C];
		check = new boolean[26];
		for (int row = 0; row < R; row++) {
			String s= sc.next();
			board[row]=s.toCharArray();
		}
		check[board[0][0]-'A']=true;
		System.out.println(go(0,0));
		
	}
}
