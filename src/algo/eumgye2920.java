package algo;

import java.util.Scanner;

public class eumgye2920 {
	private static int length=8;
	private int[] eum=null;
	private Scanner s=null;
	private String result=null;
	public eumgye2920() {
		init();
	}
	public void init(){
		s=new Scanner(System.in);
		eum=new int[length];
		for(int i=0;i<length;i++)//음계를 받는다
			eum[i]=s.nextInt();
		

	}
	public String discriminate(){
		if(eum[0]==1) result=ascendingCheck(0);
		else if(eum[0]==8) result=descendingCheck(0);
		else result="mixed";
		
		return result;
	}
	public String ascendingCheck(int index){
		if(index==8)//배열탐색이 무사히 끝나면
			return "ascending";
		else if(eum[index]!=(index+1))//하나라도 ascending이 아니라면
			return "mixed";
		else
			return ascendingCheck(++index);//재귀적 배열 탐색
	}
	public String descendingCheck(int index){
		if(index==8)//배열탐색이 무사히 끝나면
			return "descending";
		else if((eum[index]+index)!=8)//하나라도 ascending이 아니라면
			return "mixed";
		else
			return descendingCheck(++index);//재귀적 배열 탐색
	}
	public static void main(String[] args) {
		eumgye2920 m=new eumgye2920();
		System.out.println(m.discriminate());
		

	}

}
