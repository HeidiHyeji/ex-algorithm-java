package test;
import java.util.Scanner;
public class NumToKorean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String num[]= {"","ÀÏ","ÀÌ","»ï","»ç","¿À","À°","Ä¥","ÆÈ","±¸",""};
		String unit[]= {"","½Ê","¹é","Ãµ"};
		String big[]= {"","¸¸","¾ï"};
		String str="";
		int i=0;
		while(n!=0) {
			String tmp="";
			if(i==0 || n%10!=1) {
				tmp+=num[n%10];
			}
			if(i%4==0) {
				tmp+=big[i/4];
			}else if(n%10 != 0){
				tmp+=unit[i%4];
			}
			str=tmp+str;
			
			n/=10;
			i++;
		}
		System.out.println(str);
		sc.close();
	}
	
}
