import java.util.Scanner;

public class Moving_Cheese {
	int load(int n, int [][] cheese, int [][]max){
		for(int i=1; i<=n; i++){
			for(int j =1; j<=n; j++){
				//����� ���� max�� ��
				if(max[i-1][j]< max[i][j-1])
					max[i][j]=max[i][j-1];
				else
					max[i][j]=max[i-1][j];
				//ġ�������� +1
				if(cheese[i][j]==1){
					max[i][j]++;
				}
			}
		}
		return max[n][n];
	}
	public static void main(String [] args){
		 Moving_Cheese mc = new  Moving_Cheese();
		 Scanner s = new Scanner(System.in);
		 int N = s.nextInt();//�迭ũ�� N*N
		 int M = s.nextInt();//ġ�� ����
		 int [][] cheese = new int[N+1][N+1];
		 int [][] max = new int[N+1][N+1];
		 //ġ��� +1�̶� ����(booleanŸ�� ���� �Ͽ� true�� +1�ΰ����� �ص� ��)
		 for(int i=0; i<M; i++){
			 cheese[s.nextInt()][s.nextInt()]=1;
		 }
		//���۽ð�
		long startTime = System.currentTimeMillis();
		 int result = mc.load(N,cheese,max);
		 System.out.println("�ִ� ġ�� �� �� :"+result);
		 s.close();
		//����ð�
		long endTime = System.currentTimeMillis();
		System.out.print("�ҿ�ð�(��.0f) : "+ ( endTime - startTime )/1000.0f +"��");
	}
}
