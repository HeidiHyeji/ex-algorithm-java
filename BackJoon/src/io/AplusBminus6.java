package io;
import java.util.Scanner;
import java.util.StringTokenizer;
public class AplusBminus6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for(int i=0;i<T;i++) {
			StringTokenizer st= new StringTokenizer(sc.nextLine(),",");
			System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
		}
	}
}
