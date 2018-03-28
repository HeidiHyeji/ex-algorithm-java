package bruteforceSearch1;

import java.util.Arrays;
import java.util.Scanner;

public class MakePwd1759 {
	static void go(int n,char[] alpa,String pwd,int i) {
		if(n==pwd.length()) {//������ ��� ���
			//���� ���� ���� üũ
			if(check(pwd)) {
				System.out.println(pwd);
			}
			return;
		}
		if(i>=alpa.length) {//�Ұ����Ѱ��
			return;
		}
		//�������� �Ѿ��
		go(n,alpa,pwd+alpa[i],i+1);//���� ���ĺ� ����
		go(n,alpa,pwd,i+1);//���� ���ĺ� ���� ���� ���
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
