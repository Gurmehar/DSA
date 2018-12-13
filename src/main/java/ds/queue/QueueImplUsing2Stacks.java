package ds.queue;

import java.util.Stack;

public class QueueImplUsing2Stacks {

    private Stack enqueue= new Stack<Integer>();
    private Stack dequeue= new Stack<Integer>();

    public void enqueue(int data){
        enqueue.push(data);
    }

    public void dequeue(){
        if(this.dequeue.isEmpty()){
            while(!this.enqueue.isEmpty()){
                this.dequeue.push(this.enqueue.pop());
            }
        }
        if(!this.dequeue.isEmpty()){
            System.out.println(this.dequeue.pop());
        }else{
            System.out.println("Queue Empty");
        }
    }


}
