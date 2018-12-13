package ds.queue;

public class MyQueue {
 private Node front;
 private Node rear;
 
public MyQueue() {
  super();
  // TODO Auto-generated constructor stub
}
public MyQueue(Node front, Node rear) {
  super();
  this.front = front;
  this.rear = rear;
}
public Node getFront() {
  return front;
}
public void setFront(Node front) {
  this.front = front;
}
public Node getRear() {
  return rear;
}
public void setRear(Node rear) {
  this.rear = rear;
}
 
public <T> Node enQueue(T data){
 
  if(this.front==null){
    this.front.setData(data);
    this.front.setNext(null);
    this.rear=this.front;
    
    
  }else {
    Node next=new Node();
    next.setData(data);
    this.rear.setNext(next);
    return this.rear;
  }
 
  return this.front;
}

public  <T> T deQueue(){
  if(this.front==null){
    return null;
  }
  
  Node temp=this.front;  
  this.front=this.front.getNext();
  temp.setNext(null);
  return (T) temp.getData();
}
 
public boolean isEmpty(){
  return this.front==null;
}
 
 
 
}
