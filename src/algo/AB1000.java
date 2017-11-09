package algo;

import java.util.Scanner;

public class AB1000 {
	private static int A;
	private static int B;
	Scanner sc;
	public AB1000(){
		 sc= new Scanner(System.in);
		
	}
	public void run(){
		try{
			A=sc.nextInt();
			B=sc.nextInt();
			
			System.out.println(A+B);
			}catch(Exception e){}
			sc.close();
	}
	public static void main(String[] args) {
		AB1000 ab1000=new AB1000();
		ab1000.run();
	}

}
