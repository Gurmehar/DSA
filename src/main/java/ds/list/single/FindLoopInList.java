package ds.list.single;

import ds.list.circular.Circular;
import ds.list.node.Node;

public class FindLoopInList {

  public boolean hasLoop(Node head) throws Exception {
    if (head == null){
      throw new Exception("Empty list..");
    }
    Node fastNode=head;
    Node slowNode=head;
    while(slowNode!=null && fastNode!=null){
      fastNode=fastNode.getNext().getNext();
      slowNode=slowNode.getNext();
      if(fastNode==slowNode){
        System.out.println("Loop Detected...");
        return true;
      }
     }
    return false;
  }
  
  public static Node findHeadNodeInLoopedList(Node head) throws Exception{
    boolean  loopFlag= false;
    if (head == null){
      throw new Exception("Empty list..");
    }
    Node fastNode=head;
    Node slowNode=head;
    while(slowNode!=null && fastNode!=null){
      fastNode=fastNode.getNext().getNext();
      slowNode=slowNode.getNext();
      if(fastNode==slowNode){
        System.out.println("Loop Detected...");
        loopFlag= true;
        break;
      }
     }
   
    
    if(loopFlag){
      slowNode=head;
      while(slowNode!=fastNode){
        slowNode=slowNode.getNext();
        fastNode=fastNode.getNext();
      }
      return slowNode;
    }
    return null;
  }
  
  public static int findLengthIfLoopDetected(Node head) throws Exception{
    if (head == null){
      throw new Exception("Empty list..");
    }
    boolean loopFlag= false;
    Node fastNode=head;
    Node slowNode=head;
    while(slowNode!=null && fastNode!=null){
      fastNode=fastNode.getNext().getNext();
      slowNode=slowNode.getNext();
      if(fastNode==slowNode){
        System.out.println("Loop Detected...");
        loopFlag= true;
        break;
      }
     }
    
    int len=0;
    if(loopFlag){
      do{
        fastNode=fastNode.getNext();
        len++;
      }while(fastNode!=slowNode);
      
    }
    return len;
    
  }
  
  public static void spiltCircularList(Node head) throws Exception{
    
    Node fastNode=head;
    Node slowNode =head;    
    Node head2=head;
    
    Node headNode=findHeadNodeInLoopedList(head);
    System.out.println("headNode ::"+headNode);
    head=headNode;
        
    while(fastNode.getNext()!=head && fastNode.getNext().getNext()!=head){
      slowNode=slowNode.getNext();
      fastNode=fastNode.getNext().getNext();
    }
    
    /** for even case*/
    if(fastNode.getNext().getNext()==head){
      fastNode=fastNode.getNext();
    }
    
    if(head.getNext()!=head){
       head2=slowNode.getNext();
    }
    
    fastNode.setNext(slowNode.getNext());
    slowNode.setNext(headNode);
    
    
    
    
   Circular.printData(head2);
    System.out.println();
    Circular.printData(headNode);
   
    
  }
  

}
