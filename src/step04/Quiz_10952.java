package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz_10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num1 = 1;
		int num2 = 1;
		
		while (num1 > 0 && num2 > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			num1 = Integer.valueOf(st.nextToken());
			num2 = Integer.valueOf(st.nextToken());
			
			if (num1 == 0 && num2 ==0) {
				break;
			}
			
			bw.write(num1 + num2 + "\n");
		} 
		br.close();
		bw.flush();
		bw.close();
	}

}
