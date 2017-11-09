package algo;

import java.util.Scanner;

public class seoltangbaedal2839 {
	private static int n;
	private Scanner s;
	private int big = 0, small = 0;
	private int number = -1;

	public seoltangbaedal2839() {
		s = new Scanner(System.in);
		n = s.nextInt();// ����̰� ����ؾ��ϴ� ������ ����
	}

	private int run(int i) {
		//System.out.println(number);
		int tmp = 0;
		small = i;
		if ((n - 3 * i) == 0 && number>small)
			number = small; //������ ���԰� 3�� ����� ��
		else if ((n - 3 * i) < 3)
			return number; //��������
		big = (n - 3 * i) / 5;
		tmp = (n - 3 * i) % 5;
		if (tmp >= 3) {
			small = tmp / 3 + small;
			tmp = tmp % 3;
		}
		if (tmp == 0 && (number == -1 || number > big + small)) {
			number = big + small;
		}
		return run(++i); //���ȣ��
	}

	public void print() {
		System.out.println(run(0));
	}

	public static void main(String[] args) {
		seoltangbaedal2839 s = new seoltangbaedal2839();
		s.print();
	}

}
