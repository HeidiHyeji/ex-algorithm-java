package algo;

import java.util.Scanner;

public class OXQuiz8958 {
	private Scanner s;
	private int testcase = 0;
	private int[] cnt = null;
	private String str = null;

	public OXQuiz8958() {
		s = new Scanner(System.in);
	}

	public int count() {
		int sum = 0; // 한문자열의 총합
		str = s.nextLine(); // 문자열 입력
		int length = str.length(); // 문자열 길이

		// System.out.println(str.length()+"A");
		cnt = new int[length + 1];
		cnt[0] = 0;
		/* 문자열 탐색 */
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == 'X')
				cnt[i + 1] = 0;
			else
				cnt[i + 1] = cnt[i] + 1;

			sum += cnt[i + 1];
		}
		return sum;
	}

	public void run() {
		testcase = Integer.parseInt(s.nextLine());
		for (int i = 0; i < testcase; i++) {
			System.out.println(count());
		}

	}

	public static void main(String[] args) {
		OXQuiz8958 m = new OXQuiz8958();
		m.run();
	}
}