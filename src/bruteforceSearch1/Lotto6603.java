package bruteforceSearch1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto6603 {
	static int[] prev_permutation(int[] arr) {
		int idx = arr.length-1;
		while(idx>=1 && arr[idx-1]<=arr[idx]) idx--;
		if(idx == 0) {
			return null;
		}else {
			int prev = arr.length-1;
			while(prev>=idx && arr[idx-1]<=arr[prev]) prev--;
			int z = arr[idx-1]; //swap
			arr[idx-1] = arr[prev];
			arr[prev] = z;
			//내림 차순 버블 정렬
			for (int i = idx; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] < arr[j]) {
	                    int tmp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = tmp;
	                }
	            }
	        }
		}
		return arr;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			int k = sc.nextInt();
			if (k == 0)
				break;
			int[] s = new int[k];
			int c[] = new int[k];
			Arrays.fill(c, 0);
			for (int i = 0; i < 6; i++) {
				c[i] = 1;
			}
			for (int i = 0; i < k; i++) {
				s[i] = sc.nextInt();
			}

			do {
				String str = "";
				for (int i = 0; i < k; i++) {
					if (c[i] == 1) {
						str += s[i] + " ";
					}
				}
				str = str.trim();
				str += "\n";
				bw.write(str);
			} while ((c = prev_permutation(c)) != null);
			bw.write("\n");
			bw.flush();
		}		
	    bw.close();
	    sc.close();
	}
}
