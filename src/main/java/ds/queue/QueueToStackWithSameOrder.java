package ds.queue;

import java.util.Queue;
import java.util.Stack;

public class QueueToStackWithSameOrder {


    public static Stack<Integer> change(Queue<Integer> queue){
        Stack<Integer> stack = new Stack ();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        return stack;
    }


}
