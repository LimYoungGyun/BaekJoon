package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz_11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.valueOf(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		for (int i = 1; i <= count; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write("Case #" + i + ": " + (Integer.valueOf(st.nextToken()) + Integer.valueOf(st.nextToken())) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
