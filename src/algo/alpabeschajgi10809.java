package algo;

import java.util.Scanner;

public class alpabeschajgi10809 {
	private Scanner s;
	private String str;
	private int[] arr;

	public alpabeschajgi10809() {
		s = new Scanner(System.in);
		str = s.nextLine();
		arr = new int[26];// 알파벳의 개수
		init();
	}

	public void init() {// -1로 초기화
		for (int i = 0; i < arr.length; i++)
			arr[i] = -1;
	}

	public void check(char c, int index) {
		for (int i = 97; i <= 122; i++) {
			if (((int) c == i) && (arr[i - 97] == -1))// 아스키코드가 같고 첫번째 값이면 인덱스를
														// 저장
				arr[i - 97] = index;
		}
	}
	public void print(){
		for (int i = 0; i < arr.length-1; i++)
			System.out.print(arr[i]+" ");
	}
	public void run() {
		for (int i = 0; i < str.length(); i++)
			check(str.charAt(i), i);
		print();
		System.out.println(arr[arr.length-1]);
	}

	public static void main(String[] args) {
		alpabeschajgi10809 m = new alpabeschajgi10809();
		m.run();

	}

}
