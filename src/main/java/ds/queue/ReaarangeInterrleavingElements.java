package ds.queue;

import java.util.Queue;
import java.util.Stack;

public class ReaarangeInterrleavingElements {

    public void rearangeElements(Queue<Integer> queue){
        if(queue.size()%2!=0){
            return;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int mid=queue.size()/2;
         for(int i=0;i<mid;i++){
             stack.push(queue.poll());
         }
         while(!stack.isEmpty()){
             queue.add(stack.pop());
         }

        for(int i=0;i<mid;i++){
            stack.push(queue.poll());
        }

        while(!stack.isEmpty()){
            System.out.println("[ "+stack.pop()+" , "+queue.poll()+" ]");
        }

    }

}
