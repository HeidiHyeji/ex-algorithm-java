package algo;

import java.util.Scanner;

public class daneogongbu1157 {
	private Scanner s;
	private String str;// 입력받은 단어
	private int[] arr; // A-Z알파벳 갯수저장 배열
	private int maxIndex = 0;
	private Boolean multiFlag = true;
	private int max=0;

	public daneogongbu1157() {
		arr = new int[26];
		s = new Scanner(System.in);
	}

	public void init() {
		int tmp = 0;
		
		str = s.nextLine();
		str = str.replaceAll(" ", "");// 공백 제거
		str = str.toUpperCase();// 대문자 단어로 변환하기
		for (int j = 0; j < arr.length; j++)
			arr[j] = 0;

		for (int i = 0; i < str.length(); i++) {
			tmp = ((int) str.charAt(i)) - 65;// 65:A,90:Z
			max=arr[maxIndex];
			++arr[tmp];// 아스키코드값에 따라 배열에 갯수저장
			search(tmp);
		}

	}

	public void search(int alphaInt) {
		if (arr[alphaInt] > max) {// 가장 많이 사용된 알파벳이면
			multiFlag = false;
			maxIndex = alphaInt;// 인덱스 저장
		} else if (arr[alphaInt]==max)//(가장 많이 사용된 알파벳이 여러개면
			multiFlag = true;// 플래그 표시
	}

	public void run() {
		init();
		if (multiFlag)
			System.out.println("?");
		else
			System.out.println((char) (maxIndex + 65));
	}

	public static void main(String[] args) {
		daneogongbu1157 m = new daneogongbu1157();
		m.run();
	}
}
