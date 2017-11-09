package algo;

import java.util.Scanner;

public class AB1008 {
	private static int A;
	private static int B;
	Scanner sc;
	public AB1008(){
		 sc= new Scanner(System.in);
		
	}
	public void run(){
		double result=0;
		try{
			A=sc.nextInt();
			B=sc.nextInt();
			result=A/(double)B;
			
			System.out.println(result);
			}catch(Exception e){}
			sc.close();
	}
	public static void main(String[] args) {
		AB1008 ab1000=new AB1008();
		ab1000.run();
	}

}
