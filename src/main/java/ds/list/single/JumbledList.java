package ds.list.single;

import ds.list.node.Node;

public class JumbledList {

  public static Node shuffle(Node head){
    Node slow=head,fast=head;
    boolean flag=true;
    while(fast!=null){
      if(flag){
        slow=slow.getNext();
        flag=!flag;    
      }else{
        flag=!flag;
      }
      fast=fast.getNext();     
    }
    fast=head;
    slow=midReverse(slow);
    
    Node temp=new Node("0");
    flag=true;
    while(slow!=null){
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
    
    Singly.printList(head);
    return head;
    
  }
  
  private static Node midReverse(Node head){
    System.out.println(head);
    Node curNode=head;
    Node temp=null;
    while(curNode!=null){
      curNode=curNode.getNext();
      head.setNext(temp);
      temp=head;
      head=curNode;
    }
   
    return temp;
  }
  
}
