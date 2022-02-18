package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz_02742 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.valueOf(br.readLine());
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = num; i > 0; i--) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
