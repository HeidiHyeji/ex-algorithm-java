package algo;

import java.util.Scanner;

public class geudaelochullyeoghagi11718 {
	private Scanner sc = null;
	private String str = null;

	public geudaelochullyeoghagi11718() {
		sc = new Scanner(System.in);
	}

	public void run() {
		try {
			str = sc.nextLine();
			System.out.println(str);
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		geudaelochullyeoghagi11718 g = new geudaelochullyeoghagi11718();
		for (int i = 0; i < 100; i++) {
			g.run();
		}

	}

}
