import java.util.Scanner;


public class TEXQuotes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean closed = true;

		while(sc.hasNext()) {
			String line = sc.nextLine();
			String newLine = "";
			for(int i = 0; i < line.length(); i++) {
				String s = line.substring(i,i+1);
				if(s.equals("\"")) {
					if(closed) {
						s = "``";
						closed = false;
					} else {
						s = "''";
						closed = true;
					}
				}
				newLine += s;
			}
			System.out.println(newLine);
		}
	}
}