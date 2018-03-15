package forfun;
import java.util.Scanner;
public class SnailWantToGoUp2869 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int V=sc.nextInt();
		System.out.println((int)Math.ceil((double)(V-B)/(A-B)));

	}
}
