package algo;

import java.util.Scanner;

public class susjauigaesu2577 {

	private Scanner s;
	private int A;
	private int B;
	private int C;
	private int value = 0;
	private String strValue = null;

	public susjauigaesu2577() {
		s = new Scanner(System.in);
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
	}

	public void convert() {
		value = A * B * C;
		strValue = String.valueOf(value);
	}

	public void count() {
		int count;
		for (int number = 0; number <= 9; number++) {
			count=0;
			for (int i = 0; i < strValue.length(); i++) {
				if(Integer.parseInt(strValue.charAt(i)+"")==number)
					++count;
			}
			System.out.println(count);
		}
	}
	public void run(){
		convert();
		count();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		susjauigaesu2577 m=new susjauigaesu2577();
		m.run();
	}

}
