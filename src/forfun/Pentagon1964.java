package forfun;
import java.util.Scanner;
public class Pentagon1964 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
//			for(int i=2;i<=N;i++) {
//				sum+=3*i+1;//((i+1)*5-5)-(i*2-1);
//			}
//			sum=4+3*((N*N+N-2)/2)+N;
			System.out.println((4+3*((N*N+N-2)/2)+N)%45678);
			

	}
}
