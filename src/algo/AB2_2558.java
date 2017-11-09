package algo;

import java.util.Scanner;

public class AB2_2558 {
	private static int A;
	private static int B;

	Scanner s;

	public AB2_2558() {
		s = new Scanner(System.in);
	}

	public void run() {
		try {
			A = Integer.parseInt(s.nextLine());
			B = Integer.parseInt(s.nextLine());
		} catch (Exception e) {
		}
		
		System.out.println(A+B);
	}

	public static void main(String[] args) {
		AB2_2558 a=new AB2_2558();
		a.run();
	}

}
