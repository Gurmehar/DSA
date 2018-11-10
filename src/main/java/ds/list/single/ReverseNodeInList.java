package ds.list.single;

import ds.list.node.Node;

public class ReverseNodeInList {
  
  public static Node reverseAdjacentNodes(Node head){
    Node curNode=head;
    Node temp1=null,temp2=null;
    
    while(curNode!=null && curNode.getNext()!=null){
      if(temp1!=null){
       /** Important part to keep Nodes */
        temp1.getNext().setNext(curNode.getNext());
      }
      temp1=curNode.getNext();
      curNode.setNext(temp1.getNext());
      temp1.setNext(curNode);
      if(temp2==null){
        temp2=temp1;
      }
      curNode=curNode.getNext();     
      
    }
    return temp2;
  }
  
  

}
