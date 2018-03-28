package bruteforceSearch1;

import java.util.Arrays;
import java.util.Scanner;

public class MakePwd1759 {
	static void go(int n,char[] alpa,String pwd,int i) {
		if(n==pwd.length()) {//정답인 경우 출력
			//모음 자음 조건 체크
			if(check(pwd)) {
				System.out.println(pwd);
			}
			return;
		}
		if(i>=alpa.length) {//불가능한경우
			return;
		}
		//다음으로 넘어가기
		go(n,alpa,pwd+alpa[i],i+1);//현재 알파벳 선택
		go(n,alpa,pwd,i+1);//현재 알파벳 선택 안할 경우
	}
	static boolean check(String pwd) {
		char[] arr=pwd.toCharArray();
		int mo=0;
		int ja=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				mo++;
			}else {
				ja++;
			}
		}
		return mo>=1 && ja>=2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int C = sc.nextInt();
		char[] alpa=new char[C];
		for(int i=0;i<C;i++) {
			alpa[i]=sc.next().charAt(0);
		}
		Arrays.sort(alpa);
		go(L,alpa,"",0);
	}
}
