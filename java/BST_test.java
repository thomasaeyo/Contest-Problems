import java.util.Scanner;


public class BST_test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String next;
		BST<Integer> bst = new BST<Integer>();
		while(!(next = sc.next()).equals("END")) {
			if(next.equals("INSERT")) {
				int v = sc.nextInt();
				bst.insert(v);
				bst.print();
			} else if(next.equals("CONTAINS")) {
				int v = sc.nextInt();
				System.out.println(bst.contains(v));
			} else if(next.equals("DELETE")) {
				int v = sc.nextInt();
				bst.delete(v);
				bst.print();
			}
		}
	}
}