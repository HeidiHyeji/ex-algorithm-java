package algo;

import java.util.Scanner;

public class seoltangbaedal2839 {
	private static int n;
	private Scanner s;
	private int big = 0, small = 0;
	private int number = -1;

	public seoltangbaedal2839() {
		s = new Scanner(System.in);
		n = s.nextInt();// 상근이가 배달해야하는 설탕의 무게
	}

	private int run(int i) {
		//System.out.println(number);
		int tmp = 0;
		small = i;
		if ((n - 3 * i) == 0 && number>small)
			number = small; //설탕의 무게가 3의 배수일 때
		else if ((n - 3 * i) < 3)
			return number; //종료조건
		big = (n - 3 * i) / 5;
		tmp = (n - 3 * i) % 5;
		if (tmp >= 3) {
			small = tmp / 3 + small;
			tmp = tmp % 3;
		}
		if (tmp == 0 && (number == -1 || number > big + small)) {
			number = big + small;
		}
		return run(++i); //재귀호출
	}

	public void print() {
		System.out.println(run(0));
	}

	public static void main(String[] args) {
		seoltangbaedal2839 s = new seoltangbaedal2839();
		s.print();
	}

}
