package CTDL.SPOJ;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.*;
import java.util.*;

public class ADAFRIEN {
	public static void main(String[] args) throws IOException, java.lang.NumberFormatException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Long> maps = new HashMap<String, Long>();
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		String name;
		long value;
		while (n-- > 0) {
			str = new StringTokenizer(br.readLine());
			name = str.nextToken();
			value = Long.parseLong(str.nextToken());
			if (maps.containsKey(name)) {
				maps.replace(name, maps.get(name) + value);
				continue;
			}
			maps.put(name, value);
		}
		List<Long> values = new LinkedList<>(maps.values());
		Collections.sort(values);
		long sum = 0;
		while (m-- >0 ) {
			if (values.isEmpty()) {
				break;
			}
			sum += values.get(values.size() - 1);
			values.remove(values.size() - 1);
		}
		bw.write(sum+"");
		bw.flush();
	}
}
