import java.util.Scanner;

public class Count_Sum {
	int Sum[]= new int[100];
	
	public int sum(int N){
		Sum[1] = 1;
		Sum[2] = 2;
		Sum[3] = 4;
		for(int i = 4 ; i <= N ; i++)
			Sum[i]=Sum[i-1]+Sum[i-2]+Sum[i-3];
		return Sum[N];
	}
	
	public static void main (String []args){
		Count_Sum cs = new Count_Sum();
		Scanner s = new Scanner(System.in);
		int num;
		while(true){
		//N�� 1 �̻� 10000 ���� �˻�
		do{
			num = s.nextInt();
			
		}
		while(num > 100000||num < 0);
		if(num==0) break;
		long startTime = System.currentTimeMillis();
		int result = cs.sum(num); 
		
		System.out.println(result);
		long endTime = System.currentTimeMillis();
		System.out.print("�ҿ�ð�(��.0f) : "+ ( endTime - startTime )/1000.0f +"��");
		}
		s.close();
		
		
	}
}
