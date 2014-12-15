import java.util.LinkedList;


public class reverse_LL {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
        // 1 -> 2 -> 3
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(reverse(ll));
	}

	public static LinkedList<Integer> reverse(LinkedList<Integer> ll) {
        if(ll.peek() == null) return ll;
        int hd = ll.poll();
        reverse(ll).add(hd);
        return ll;
	}
}