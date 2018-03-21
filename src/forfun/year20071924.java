package forfun;
import java.util.Scanner;
public class year20071924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();		
		int k=(y+(26*(x+1)/10)+07+(07/4)+(20/4)+(-2*20));//첼러의 공식
		if(x==1 || x==2) {
			x+=12;
			k=(y+(26*(x+1)/10)+06+(06/4)+(20/4)+(-2*20));//첼러의 공식
		}
		if(k<0) {
			k=(k/7-1)*7-k;//음수의 나머지 구하기
		}else {
			k%=7;
		}
		switch(Math.abs(k)) {
		case 1:
			System.out.println("SUN");
			break;
		case 2:
			System.out.println("MON");
			break;
		case 3:
			System.out.println("TUE");
			break;
		case 4:
			System.out.println("WED");
			break;
		case 5:
			System.out.println("THU");
			break;
		case 6:
			System.out.println("FRI");
			break;
		case 0:
			System.out.println("SAT");
			break;			
		}
	}
}
