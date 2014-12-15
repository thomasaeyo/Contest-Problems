import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.IndexOutOfBoundsException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;


public class B {
	private static class Reader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public Reader(InputStream inputstream) {
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String next() throws IOException {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public String nextLine() throws IOException {
			return reader.readLine();
		}
	}

	public static void main(String[] args) throws IOException {
		Reader reader = new Reader(System.in);
		int n = reader.nextInt();
		HashMap<Integer,HashMap<String, Integer>> map = new HashMap<Integer,HashMap<String, Integer>>();
		for(int i = 0; i < n; i++) {
			String s = reader.next();
			if(map.containsKey(s.length())) {
				HashMap<String, Integer> map2 = map.get(s.length());

				boolean isDup = false;
				for(Entry<String,Integer> entry : map2.entrySet()) {
					if(isSimilar(s, entry.getKey()) && isSimilar(entry.getKey(), s)) {
						isDup = true;
						map2.put(entry.getKey(), entry.getValue() + 1);
						break;
					}
				}

				if(isDup == false) {
					map2.put(s,1);
				}

				map.put(s.length(), map2);
			} else {
				HashMap<String, Integer> map2 = new HashMap<String, Integer>();
				map2.put(s,1);
				map.put(s.length(), map2);
			}
		}

		long ans = 0;

		for(Entry<Integer, HashMap<String, Integer>> entry : map.entrySet()) {
			for(Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
				int num = entry2.getValue();
				ans += (long)num*(long)(num-1) / (long)2;
			}
		}

		System.out.println(ans);
	}
	
	// requires: s1 and s2 have same length
	private static boolean isSimilar(String s1, String s2) {
		HashMap<String,String> map = new HashMap<String,String>();
		for(int i = 0; i < s1.length(); i ++) {
			if(map.containsKey(s1.substring(i,i+1))) {
				if(!(map.get(s1.substring(i,i+1)).equals(s2.substring(i,i+1)))) {
					return false;
				}
			} else {
				map.put(s1.substring(i,i+1), s2.substring(i,i+1));
			}
		}
		return true;
	}
}