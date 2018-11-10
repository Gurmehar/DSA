package ds.list.single;

import ds.list.node.Node;

public class ReverseSinglyList {
  
  public static Node reverse(Node head){
    
    if(head==null){
      return head;
    }
    
    Node curNode=head;
    Node temp=null;
    while(curNode!=null){
      curNode=head.getNext();
      head.setNext(temp);
      temp=head;
      head=curNode;
    }
    return temp;
  }

  public static void printListInReverse(Node head){
    
    if(head==null){
      return;
    }
    printListInReverse(head.getNext());
    System.out.println(head.getData());
  }
  
  public static String oddOrEven(Node head){
    Node curNode=head;
    while(curNode!=null && curNode.getNext()!=null){
      curNode=curNode.getNext().getNext();
    }
    return (curNode==null)?"even":"odd";
  }
}
