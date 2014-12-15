import java.util.LinkedList;
import java.util.ListIterator;


public class add_two_numbers {
	public static void main(String[] args) {
        LinkedList<Integer> ll_1 = new LinkedList<Integer>();
        ll_1.add(3);
        ll_1.add(5);
        ll_1.add(4);
        LinkedList<Integer> ll_2 = new LinkedList<Integer>();
        ll_2.add(5);
        ll_2.add(7);
        ll_2.add(3);
        ll_2.add(7);
        print(ll_1);
        print(ll_2);
        LinkedList<Integer> sum = add(ll_1, ll_2);
        print(sum);
	} 

    public static LinkedList<Integer> add(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
        LinkedList<Integer> sum = new LinkedList<Integer>();
        ListIterator<Integer> li1 = ll1.listIterator();
        ListIterator<Integer> li2 = ll2.listIterator();
        int carry = 0;
        int temp;
        int i = 0;
        while(li1.hasNext() && li2.hasNext()) {
            temp = li1.next() + li2.next() + carry;
            carry = temp / 10;
            sum.add(temp % 10);
            i++;
        }
        if(li1.hasNext()) {
            while(li1.hasNext()) {
                temp = li1.next() + carry;
                carry = temp / 10;
                sum.add(temp % 10);
            }
        } else if(li2.hasNext()) {
            while(li2.hasNext()) {
                temp = li2.next() + carry;
                carry = temp / 10;
                sum.add(temp % 10);
            }
        }
        if(carry > 0) {
            sum.add(carry);
        }
        return sum;
    }

    public static void print(LinkedList<Integer> ll) {
        for(int i = 0; i < ll.size(); i ++) {
            System.out.print(ll.get(i));
        }
        System.out.println();
    }
}