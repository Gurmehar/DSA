package ds.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Check4ConsecutivePairsInStack {
    private Queue<Integer> queue = new LinkedList<Integer>();

    public  boolean  checkForPairs(Stack<Integer> stack){
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        while(!this.queue.isEmpty()){
            stack.push(queue.poll());
        }
        boolean flag = true;
        while(!stack.isEmpty()){
            int m =stack.pop();
            int n=Integer.MIN_VALUE;
            if(!stack.isEmpty()){
                n=stack.pop();
            }else{
                return flag;
            }
            if(Math.abs(m-n)!=1){
                return false;
            }

        }
        return flag;
    }

}
