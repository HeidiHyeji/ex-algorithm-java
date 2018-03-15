package forfun;
import java.util.Scanner;
public class TVSize1297 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double z = sc.nextDouble();
		double y = sc.nextDouble();
		double x = sc.nextDouble();
		double k = Math.sqrt((z*z)/(x*x+y*y));
		System.out.println((int)Math.floor(y*k)+" "+(int)Math.floor(x*k));
	}
}
