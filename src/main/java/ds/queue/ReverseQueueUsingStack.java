package ds.queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {

  public  void reverseQueueUsingStack(Queue queue){
    Stack stack = new Stack();
    while(!queue.isEmpty()){
      stack.push(queue.poll());
    }
    while(!stack.isEmpty()){
      queue.add(stack.pop());
    }
    
    System.out.println(queue);
    
  }
  
  
}
