package DP1;

import java.util.Scanner;

public class Sticker9465 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[][] a = new int[3][N+1];
			int[][] d = new int[N+1][3];
			for (int i = 1; i <= 2; i++) {
				for (int j = 1; j <= N; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			d[1][0]=0;
			d[1][1]=a[1][1];
			d[1][2]=a[2][1];
			for(int i=2;i<=N;i++) {
				d[i][0]=Math.max(d[i-1][0], d[i-1][1]);
				d[i][0]=Math.max(d[i][0],d[i-1][2]);//i��° ��ƼĿ�� �ϳ��� ������ �ִ밪
				
				d[i][1]=Math.max(d[i-1][0], d[i-1][2])+a[1][i];//i��° ��ƼĿ�� ���� �ϳ� ������ �ִ밪
				d[i][2]=Math.max(d[i-1][0], d[i-1][1])+a[2][i];//i��° ��ƼĿ�� �Ʒ��� �ϳ� ������ �ִ밪
			}
			int max=Math.max(d[N][0], d[N][1]);
			System.out.println(Math.max(max,d[N][2]));
		}
	}
}
