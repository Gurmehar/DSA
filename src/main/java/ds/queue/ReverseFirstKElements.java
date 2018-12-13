package ds.queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {


    public void reverseKElements(Queue<Integer> queue, int k){
        if(queue.isEmpty() || k>queue.size()){
            return ;
        }
        Stack<Integer> stack= new Stack<Integer>();
        if( k>0){
            for(int i=0;i<=k;i++){
                stack.push(queue.poll());
            }
            while(!stack.isEmpty()){
                queue.add(stack.pop());
            }

            for(int i=0;i<queue.size()-k;i++){
                queue.add(queue.poll());
            }

        }
    }

}
