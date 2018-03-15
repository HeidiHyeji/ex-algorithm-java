package test;
import java.util.Scanner;
public class Sushi2531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int d= sc.nextInt();
		int k= sc.nextInt();
		int c=sc.nextInt();
		int [] sushi=new int[N+k-1];
		int[] chk = new int[3001];
		
		
		//순환배열이니까 더 더하기
		for(int i=0;i<N;i++) {//초기화
			sushi[i]=sc.nextInt();
		}
		for(int i=N;i<N+k-1;i++) {//초기화
			sushi[i]=sushi[i%N];
		}
		int res=0;
		int startIdx=0;
		int endIdx=0;
		int kCnt=0;
		int type=0;

		while(true) {
			while(endIdx<N+k-1 && kCnt<k) {
				chk[sushi[endIdx]]++;
				kCnt++;
				endIdx++;
			}
			if(kCnt<k) break;
			for(int i=0;i<3001;i++) {
				if(chk[i]>0) {
					type++;
				}
			}
			if(chk[c]<1) {
				res=Math.max(res,type+1);
			}else {
				res=Math.max(res,type);
			}
			chk[sushi[startIdx]]--;
			kCnt--;
			startIdx++;	
			type=0;
		}
		System.out.println(res);
	}
}
