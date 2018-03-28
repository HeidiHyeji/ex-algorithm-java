package bruteforceSearch1;
import java.util.Scanner;
public class RemoteControl1107 {
	static int possible(int c,boolean[] btn) {
		int len=0;
		if(c==0) {
			return btn[0]?0:1;
		}
		while(c>0) {
			if(btn[c%10]) return 0;
			len++;
			c/=10;
		}
		return len;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] btn=new boolean[10];
		int N = sc.nextInt();//ä��
		int M = sc.nextInt();
		for(int i=0;i<M;i++) {//���峭 ��ư
			btn[sc.nextInt()]=true;
		}
		
		int min=Math.abs(N-100);
		for(int i=0;i<=1000000;i++) {//���峭 ��ư�� ���� 500000(ä�μ�)�� �Ѱܼ� -�� �� �� �ּҰ��� ���� ���� ����
			int c=i;
			int p=Math.abs(c-N)+possible(c,btn);
			
			if(possible(c,btn)>0 && p<min) min=p;
			
		}
		System.out.println(min);
		sc.close();
	}
}
