package forfun;

import java.util.Scanner;
public class Star2210997 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("*");
		} else {
			num--;
			int N = 4 * num + 3;
			int M = 4 * num + 1;
			char[][] s =new char[N+1][M+1];
			for(int i=1;i<=(N+1)/2;i++) {
				if(i%2==1) {//È¦¼öÇà
					for(int j=1;j<=2*i-1;j++) {
						if(j%2==1) {
							s[i][j]='*';
						}
					}
					for(int j=2*i;j<=16-2*i;i++) {
						s[i][j]='*';
					}
					for(int j=17-2*i;j<=M;j++) {
						if(j%2==1) {
							s[i][j]='*';
						}
					}
					
				}else {//Â¦¼öÇà
					
				}
			}
			for(int i=N/2+1;i<=N;i++) {
				
			}
		}
	}

}
