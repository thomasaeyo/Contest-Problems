import java.util.Scanner;

public class Kolya_and_Tandem_Repeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int k = sc.nextInt();
		String ss = s;
		for(int x = 0; x < k; x++) ss += ".";
		int output = -1;
		boolean found = false;
		boolean out = false;
		for(int size = ss.length(); size > 0; size--) {
			for(int i =0; i < ss.length() - size + 1; i++) {
				String sub = ss.substring(i, i+size);
				if(is_tandem(sub, find_k(sub))) {
					found = true;
					output = size;
					break;
				}
			}
			if(found == true) break;
		}
		System.out.println(output);
	}

	public static boolean is_tandem(String s, int k) {
		if(s.length() % 2 == 1) return false;
		if(s.length() <= 2*k) return true;
		for(int x = 0; x < (s.length() / 2); x++) {
			if(!s.substring(x,x+1).equals(s.substring(x + s.length()/2, x + s.length()/2 + 1)) && !s.substring(x + s.length()/2, x + s.length()/2 + 1).equals(".")) {
				return false;
			}
		}
		return true;
	}

	public static int find_k(String s) {
		int n = 0;
		for(int x = 0; x < s.length(); x++) {
			if(s.substring(x,x+1).equals(".")) n += 1;
		}
		return n;
	}
}
