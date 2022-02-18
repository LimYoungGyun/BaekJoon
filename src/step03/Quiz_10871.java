package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz_10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.valueOf(st.nextToken());
		int X = Integer.valueOf(st.nextToken());
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < N; i++) {
			int result = Integer.valueOf(st.nextToken());
			if (X > result) {
				bw.write(result + " ");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
