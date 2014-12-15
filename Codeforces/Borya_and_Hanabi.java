import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Borya_and_Hanabi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> set = new HashSet<String>();
		sc.nextLine();
		String[] cards = sc.nextLine().split(" ");
		HashMap<String, ArrayList<String>> edge_list = new HashMap<String, ArrayList<String>>();
		for(int c = 0; c < n; c++) {
			set.add(cards[c]);
			String color = cards[c].substring(0,1);
			String number = cards[c].substring(1,2);
			ArrayList<String> neighbors = new ArrayList<String>();
			neighbors.add(color);
			neighbors.add(number);
			edge_list.put("e"+c, neighbors);
			for(int x = 0; x < c; x++) {
				if(edge_list.get("e"+x).contains(color) || edge_list.get("e"+x).contains(number)) {
					edge_list.get("e"+x).add("e"+c);
					edge_list.get("e"+c).add("e"+x);
				}
			}
		}
		int max = 0;
		int min = 101;
		for(int x = 0; x < edge_list.size(); x++){
			ArrayList<String> value = edge_list.get("e"+x);
			if(value.size() > max) {
				max = value.size();
			}
			if(value.size() < min && value.size() > 2) {
				min = value.size();
			}
		}
		int adjustment = 0;
		if(max - min == 1 && edge_list.size() > 3) adjustment = 1;
		if(max - min > 1){
			adjustment = (max - min) / 2;
		}
		int answer = (n - 1) - (n - set.size()) - adjustment;
		for(int x = 0; x < n; x++) {
			System.out.println("e" + x + edge_list.get("e"+x));
		}
		System.out.println("diff: " + (max-min));
		System.out.println(answer);
	}
}

