import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class reverse_polish {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] toCompute = line.split(" ");
        Stack<Integer> stack = new Stack<Integer>();
        String operators = "+-/*";

        for(String s : toCompute) {
            if(!operators.contains(s)) {
                stack.push(Integer.parseInt(s));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                switch (s) {
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                }
            }
        }
        System.out.println(stack.pop());


        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        System.out.println(queue.size());
    }
}






// 1 2 + 3 * []
// 1 2 + 3   []
// 1 2 +     [*, 3]
// 1 2       [*, 3, +]
// 1         [*, 3, +,]

