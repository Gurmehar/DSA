package ds.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplUsing2Queue {
    private Queue<Integer> pushQueue= new LinkedList<Integer>();
    private Queue<Integer> popQueue= new LinkedList<Integer>();

    public void push(int data){
        this.pushQueue.add(data);

    }

    public void pop(){
        if(!this.popQueue.isEmpty()){
            System.out.println(this.popQueue.poll());
        }else{
            populatePop();
            System.out.println(this.popQueue.poll());
        }
    }

    private void populatePop() {
        Integer data;
        if(!this.pushQueue.isEmpty()){
            data=this.pushQueue.poll();
            populatePop();
            this.popQueue.add(data);
        }

    }

    public static void main(String[] args) {
      StackImplUsing2Queue obj = new StackImplUsing2Queue();
      obj.push(10);
      obj.push(9);obj.push(8); obj.push(7); obj.push(6);
      
      obj.pop();
      obj.pop();
      obj.pop();
      obj.pop();
      obj.pop();
      obj.pop();
      
    }
}
