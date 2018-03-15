package forfun;
import java.util.Scanner;
public class AIClock2530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int tmp=C+D;
		B=B+tmp/60;
		C=tmp%60;
		A=(A+B/60)%24;
		B=B%60;
		System.out.println(A+" "+B+" "+C);
	}
}
