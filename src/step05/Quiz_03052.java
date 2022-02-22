package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Quiz_03052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<Integer> h = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			h.add(Integer.valueOf(br.readLine()) % 42);
		}
		
		br.close();
		bw.write(h.size() + "\n");
		bw.flush();
		bw.close();
	}

}
