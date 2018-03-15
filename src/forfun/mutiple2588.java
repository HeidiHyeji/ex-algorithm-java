package forfun;
import java.util.Scanner;
public class mutiple2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum=0;
		for(int i=1;i<=3;i++) {
			int res=A*(B%10);
			System.out.println(res);
			if(i>1) res*=Math.pow(10, i-1);
			sum+=res;
			B/=10;
		}
		System.out.println(sum);
	}
}
