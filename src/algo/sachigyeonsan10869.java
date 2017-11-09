package algo;

import java.util.Scanner;

class sachigyeonsan10869 {
	private static int A;
	private static int B;
	Scanner sc;
	public sachigyeonsan10869(){
		 sc= new Scanner(System.in);
		
	}
	public void run(){
		//double result=0;
		try{
			A=sc.nextInt();
			B=sc.nextInt();
			//result=A/(double)B;
			
			System.out.println(A+B);
			System.out.println(A-B);
			System.out.println(A*B);
			System.out.println(A/B);
			System.out.println(A%B);
			
			}catch(Exception e){}
			sc.close();
	}
	public static void main(String[] args) {
		sachigyeonsan10869 ab1000=new sachigyeonsan10869();
		ab1000.run();
	}

}
