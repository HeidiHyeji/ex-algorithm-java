package algo;

import java.util.Scanner;
public class pyeonggyunjeomsu10039 {
	private Scanner s;
	private static int num=5;
	private int sum=0;
	private int ave=0;
	public pyeonggyunjeomsu10039() {
		s=new Scanner(System.in);
	}
	public void sum(){
		for(int i=0;i<num;i++){
			int score=s.nextInt();
			if(score<40)
				score=40;
			sum+=score;
		}
	}
	public int run(){
		sum();
		ave=sum/num;
		
		return ave;
	}
	public static void main(String[] args) {
		pyeonggyunjeomsu10039 m= new pyeonggyunjeomsu10039();
		System.out.println(m.run());

	}

}
