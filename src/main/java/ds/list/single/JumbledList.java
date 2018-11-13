package ds.list.single;

import ds.list.node.Node;

public class JumbledList {

  public static Node shuffle(Node head){
    Node slow=head,fast=head;
    boolean flag=true;
    while(fast.getNext()!=null){
      if(flag){
        slow=slow.getNext();
        flag=!flag;    
      }else{
        flag=!flag;
      }
      fast=fast.getNext();     
    }
    fast=head;
    Node mid=slow;
    slow=midReverse(slow);
    
    Node temp=new Node();
    flag=true;
  
    while(slow!=null && fast !=mid){
      
    if(flag){            
            temp.setNext(fast);
            temp=temp.getNext();
            fast=fast.getNext();                
            flag=!flag;
          }else{
            temp.setNext(slow);
            temp=temp.getNext();
            slow=slow.getNext();
            flag=!flag;
          }
    }
    System.out.println("fast is ::"+fast +" slow is "+slow +" & temo is ::"+temp);
    if(fast ==mid){
      temp.setNext(slow);
    }else{
      temp.setNext(fast);
    }
    System.out.println(" - - - "+head);
    return head;
    
  }
  
  private static Node midReverse(Node head){
    System.out.println("In reverse "+head);
    Node curNode=head;
    Node temp=null;
    while(curNode!=null){
      curNode=curNode.getNext();
      head.setNext(temp);
      temp=head;
      head=curNode;
    }
   Singly.printList(temp);
    return temp;
  }
  
}
