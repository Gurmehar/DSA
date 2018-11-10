package ds.list.circular;

import ds.list.node.Node;
import ds.list.single.Singly;

public class Circular {

  public int getLength(Node head) {
    Node currNode = head;
    int len = 0;
    do {
      len++;
      currNode = currNode.getNext();
    } while (currNode != head);

    return len;
  }

  public static void printData(Node head) {
    Node curNode = head;
    do {
      System.out.print(curNode.getData()+", ");
      curNode = curNode.getNext();

    } while (curNode != head);
  }

  public Node addToEnd(Node head, Node newNode) {

    newNode.setNext(head);
    Node curNode = head;
    while (curNode.getNext() != head) {
      curNode = curNode.getNext();
    }
    curNode.setNext(newNode);
    return head;

  }

  public Node addToHead(Node head, Node newNode) {

    newNode.setNext(head);
    Node curNode = head;
    while (curNode.getNext() != head) {
      curNode = curNode.getNext();
    }
    curNode.setNext(newNode);
    return newNode;

  }
  
  public Node removeFromEnd(Node head){
    Node curNode=head;
    Node previousNode=null;
    while(curNode.getNext()!=head){
      previousNode=curNode;
      curNode=curNode.getNext();
    }
    previousNode.setNext(head);
    curNode=null;
    return head;
  }
  
  public Node removeFromStart(Node head){
    Node curNode=head;
    
    while(curNode.getNext()!=head){
      
      curNode=curNode.getNext();
    }
    
    curNode.setNext(head.getNext());
    
    return curNode;
  }
  
  
  

}


