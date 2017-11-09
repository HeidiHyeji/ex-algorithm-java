package algo;

import java.util.Scanner;
import java.util.StringTokenizer;
public class daneouigaesu1152{
	private Scanner s;
	private String str=null;
	private int length=0;
	private StringTokenizer st=null;
	public daneouigaesu1152(){
		s=new Scanner(System.in);
		str=s.nextLine();//input a sentence
	}
	public void tokenizing(){
        st=new StringTokenizer(str," ");//delimiter is " "
        length=st.countTokens();//number of tokens
	}
	public void run(){
	    tokenizing();
		System.out.println(length);
	}	
	public static void main(String[] args){
		daneouigaesu1152 m=new daneouigaesu1152();
		m.run();
	}

}