package algo;
import java.util.Scanner;
public class nameoji10430 {
	private static int A;
	private static int B;
	private static int C;
	
	Scanner s;
	
	public nameoji10430(){
		s=new Scanner(System.in);
		A=s.nextInt();
		B=s.nextInt();
		C=s.nextInt();
	}
	public void run(){
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);
	}
	public static void main(String[] args) {
		nameoji10430 n=new nameoji10430();
		n.run();

	}

}
