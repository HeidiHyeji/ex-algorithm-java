package bruteforceSearch1;

import java.util.Scanner;

public class NQueen9663 {
	static boolean[][] a;
	static int ans;
	static int N;
	static boolean[] check_col;//수직
	static boolean[] check_dig;//왼쪽 위 대각선
	static boolean[] check_dig2;//오른쪽 위 대각선
	static void set(int row,int col,boolean b) {
		check_col[col]=b;
		check_dig[row+col]=b;
		check_dig2[row-col+N-1]=b;
		a[row][col]=b;
	}
	static int calc(int row) {
		if(row==N) {
			return 1;
		}
		int cnt=0;
		for(int col=0;col<N;col++) {			
			if(check(row,col)) {
				set(row,col,true);
				cnt+=calc(row+1);
				set(row,col,false);
			}
		}
		return cnt;
	}
	static boolean check(int row,int col) {
		if(check_col[col] || check_dig[row+col] || check_dig2[row-col+N-1]) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N =sc.nextInt();
		a=new boolean[N][N];
		ans=0;
		check_col=new boolean[N];
		check_dig=new boolean[N+N-1];
		check_dig2=new boolean[N+N-1];
		
		System.out.println(calc(0));
	}
}
