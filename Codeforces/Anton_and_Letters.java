import java.util.Scanner;
import java.util.HashMap;


public class Anton_and_Letters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> input = new HashMap<String, Integer>();
		String rawinput = sc.nextLine();
		for(int x = 1; x < rawinput.length() - 1; x=x+3) {
			if(!input.containsKey(rawinput.substring(x,x+1))) {
				input.put(rawinput.substring(x,x+1), x);
			}
		}
		System.out.println(input.size());
		}
	}
