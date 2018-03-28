package bruteforceSearch1;

import java.util.Scanner;

public class Sutoku2580 {
	static int N=9;
	static int[][] sutoku;
	static boolean[][] c;
	static boolean[][] c2;
	static boolean[][] c3;
	static void set(int i,int row,int col, boolean b) {
		c[row][i]=b;
		c2[col][i]=b;
		c3[(row/3)*3+col/3][i]=b;
	}
	static void go(int z) {
		if(z==81) {
			for (int row = 0; row < N; row++) {
				for (int col = 0; col < N; col++) {
					System.out.print(sutoku[row][col]+" ");
				}
				System.out.println();
			}
			return;
		}
		int row=z/N;int col=z%N;
		if(sutoku[row][col]!=0) {
			go(z+1);
		}else {
			for(int i=1;i<=N;i++) {
				if((!c[row][i])&&(!c2[col][i])&&(!c3[(row/3)*3+col/3][i])) {
					sutoku[row][col]=i;
					set(i,row,col,true);
					go(z+1);
					sutoku[row][col]=0;
					set(i,row,col,false);					
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sutoku = new int[N][N];
		c=new boolean[N][N+1];//i행에 j가 있는지
		c2=new boolean[N][N+1];//i열에 j가 있는지
		c3=new boolean[N][N+1];//작은 정사각형 i에 j가 있는지
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < N; col++) {
				sutoku[row][col] = sc.nextInt();
				if(sutoku[row][col]!=0) {
					c[row][sutoku[row][col]]=true;
					c2[col][sutoku[row][col]]=true;
					c3[(row/3)*3+col/3][sutoku[row][col]]=true;
				}
			}
		}
		go(0);
		
	}
}
