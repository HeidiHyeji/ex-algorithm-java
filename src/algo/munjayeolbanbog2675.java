package algo;
import java.util.Scanner;

public class munjayeolbanbog2675 {
	private Scanner s;
	private int T;
	private int R;
	private String S;
	public munjayeolbanbog2675() {
		s=new Scanner(System.in);
		T=s.nextInt();//테스트 케이스의 개수	
	}
	public void init(){
		R=s.nextInt();
		S=s.next();
	}
	public void run(){
		for(int i=0;i<T;i++){
			init();
			for(int j=0;j<S.length();j++){
				banbog(S.charAt(j));
			}
			System.out.println();
		}
		
	}
	public void banbog(char c){
		for(int i=0;i<R;i++)
			System.out.print(c);
	}
	public static void main(String[] args) {
		munjayeolbanbog2675 m= new munjayeolbanbog2675();
		m.run();

	}

}
