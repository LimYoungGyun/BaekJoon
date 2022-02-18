package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz_11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.valueOf(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		for (int i = 1; i <= count; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int num1 = Integer.valueOf(st.nextToken());
			int num2 = Integer.valueOf(st.nextToken());
			
			bw.write("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
