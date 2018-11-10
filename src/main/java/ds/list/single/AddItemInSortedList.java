package ds.list.single;

import ds.list.node.Node;

public class AddItemInSortedList {
  
  public Node addNodeInSortedList(Node head,Node tobeAdded){
    if(head==null){
      return tobeAdded;
    }
    Node curNode=head;
    Node temp=head;
    while(curNode!=null && ((Integer)tobeAdded.getData()<(Integer)curNode.getData())){
      temp=curNode;
      curNode=curNode.getNext();
    }
    tobeAdded.setNext(curNode);
    temp.setNext(tobeAdded);
    
    return head;
  }

}
