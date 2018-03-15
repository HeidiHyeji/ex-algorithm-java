package test;
import java.util.Scanner;
public class NumToKoreanV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String num[]= {"","��","��","��","��","��","��","ĥ","��","��",""};
		String unit[]= {"","��","��","õ","��","��","��","õ","��","��"};
		String str="";
		int i=0;
		while(n!=0) {
			String tmp="";
			if(i==0 || n%10!=1) {
				tmp+=num[n%10];
			}
			if(n%10!=0) {
				tmp+=unit[i];
			}
			str=tmp+str;
			
			n/=10;
			i++;
		}
		System.out.println(str);
		sc.close();
	}
	
}
