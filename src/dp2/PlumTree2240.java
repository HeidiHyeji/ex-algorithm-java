package dp2;

import java.util.Scanner;

public class PlumTree2240 {
	static int[][] a;
	static int[][] d;
	static int t,w;
	static int go(int sec,int turn) {
		if(sec==t+1 && turn<=w) return 0;
		if(turn>w) return 0;
		if(d[sec][turn]>0)return d[sec][turn];
		int where = (turn%2)+1;
		d[sec][turn]=Math.max(go(sec+1,turn+1),go(sec+1,turn))+a[sec][where];
		return d[sec][turn];
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		t =sc.nextInt();
		w =sc.nextInt();
		a = new int[t+1][3];
		d = new int[t+1][w+1];
		for(int i=1;i<=t;i++) {
			a[i][sc.nextInt()]=1;
			for(int j=1;j<=w;j++) {
				d[i][j]=-1;
			}
		}
		System.out.println(Math.max(go(1, 0),go(1,1)));

	}

}
