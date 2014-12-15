import java.util.Scanner;
import java.util.HashSet;


public class StringPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("----------------------------------");
		HashSet<String> perms = getPermutations(s);
		for(String p : perms) {
			System.out.println(p);
		}
	}


	public static HashSet<String> getPermutations(String s) {
		HashSet<String> set = new HashSet<String>();
		
		if(s.equals("")) return set;

		if(s.length() == 1) {
			set.add(s);
			return set;
		}

		for(int i = 0; i < s.length(); i++) {
			String a = s.substring(i,i+1);
			String rest = s.substring(0,i) + s.substring(i+1);

			HashSet<String> rest_set = getPermutations(rest);
			for(String r : rest_set) {
				set.add(a + r);
			}
		}
		return set;
	}
}