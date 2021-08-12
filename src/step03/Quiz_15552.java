package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz_15552 {

	public static void main(String[] args) throws IOException {

		// Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		
		StringTokenizer st;
		
		for (int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			
			bw.write(A + B + "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
	}

}
