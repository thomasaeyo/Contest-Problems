import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class isSubstring {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String x = reader.readLine();
		String y = reader.readLine();
		System.out.println(isSub(x,y));
	}

	public static boolean isSub(String x, String y) {
		int i = 0;
		while(i < y.length()) {
			if(y.substring(i,i+1).equals(x.substring(0,1))) {
				if(y.substring(i, i + x.length()).equals(x)) {
					return true;
				} else {
					i += x.length();
				}
			} else {
				i++;
			}
		}
		return false;
	}
}