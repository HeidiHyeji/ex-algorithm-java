package BruteforceSearch;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class set11723 {
	public static void main(String[] args) throws IOException {
	 Scanner sc =new Scanner(System.in);
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	 int M = sc.nextInt();
	 int x = 0;
	 int s = 0;
	 String str = null;
	 for(int i=0;i<M;i++) {
		 str = sc.next();
		 switch (str) {
		case "add":
			x=sc.nextInt();
			s=s|(1<<x);
			break;
		case "remove":
			x=sc.nextInt();
			s=s&~(1<<x);
			break;
		case "check":
			x=sc.nextInt();
			bw.write(((s & (1 << x)) >> x) + "\n");
//			System.out.println((s&(1<<x))>>x); 이렇게 출력하면 시간초과 에러 뜸
			break;
		case "toggle":
			x=sc.nextInt();
			s=s^(1<<x);
			break;
		case "all":
			s=(1<<21)-2; //문제의 초기화 집합에 0 이 제시되어 있지 않아서 2를 뺀다
			break;
		case "empty":
			s=0;
			break;

		default:
			break;
		}
	 }
	 bw.flush();
     bw.close();
     sc.close();
	}
}
