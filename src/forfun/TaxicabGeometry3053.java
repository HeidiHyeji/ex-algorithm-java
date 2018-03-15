package forfun;
import java.util.Scanner;
public class TaxicabGeometry3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		double u=Math.PI*R*R;
		System.out.printf("%.6f\n",u);
		System.out.printf("%.6f",2*R*R);
	}
}
