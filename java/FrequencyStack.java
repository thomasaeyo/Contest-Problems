import java.util.HashMap;
import java.util.LinkedList;

// push pop peek
public class FrequencyStack<T> {
	private HashMap<T,Integer> frequencyMap = new HashMap<T,Integer>();
	private LinkedList<T> stack = new LinkedList<T>(); 

	public void push(T item) {
		stack.addFirst(item);
	}
}