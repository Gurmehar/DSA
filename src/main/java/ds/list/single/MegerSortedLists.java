package ds.list.single;

import ds.list.node.Node;

public class MegerSortedLists {
  
  public Node mergeInRecursion(Node head1,Node head2){
    
    if(head1==null){
      return head2;
    }
    if(head2==null){
      return head1;
    }
    
    Node nxtNode=null;
    if((Integer)head1.getData()<(Integer)head2.getData()){
      nxtNode.setData(head1.getData());
       nxtNode.setNext(mergeInRecursion(head1.getNext(),head2));
      
    }else{
      nxtNode.setData(head2.getData());
      nxtNode.setNext(mergeInRecursion(head1,head2.getNext()));
    }
    
    return nxtNode;
    
  }
  
  
  public Node mergerInIterration(Node head1,Node head2){
    if(head1==null){
      return head2;
    }
    if(head2==null){
      return head1;
    }
    
    Node temp =new Node(),next=null;
    
    Node curNode1=head1;
    Node curNode2=head2;
    next=temp;
    while(curNode1!=null && curNode2!=null){
      if((Integer)curNode1.getData()<(Integer)curNode2.getData()){
        temp.setNext(curNode1);
        temp=temp.getNext();
        curNode1=curNode1.getNext();
      }else{
        temp.setNext(curNode2);
        temp=temp.getNext();
        curNode2=curNode2.getNext();
      }
      
    }
    if(curNode1==null){
      temp.setNext(curNode2);
    }else{
      temp.setNext(curNode1);
    }
    
    return next;
    
  }

}
