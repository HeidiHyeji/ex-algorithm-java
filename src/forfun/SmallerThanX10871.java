package forfun;
import java.util.Scanner;
public class SmallerThanX10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X= sc.nextInt();
		for(int i=0;i<N;i++) {
			int a=sc.nextInt();
			if(X>a) {
				System.out.print(a+" ");
			}
		}
	}
}
