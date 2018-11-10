package ds.list.single;

import ds.list.node.Node;

public class FindMiddle {

  /**
   * Find Middle by 2 ways 1. find length, then traverse till len/2 2.take 2 ptr ,first moves one
   * ptr at time and other 2 ptr at time, when ptr 2 reached end, first is at middle
   */

  public static Node getMiddle(Node head) {
    Node fastNode=head;
    Node slowNode =head;
    boolean flag=false;
    while(fastNode!=null){
      slowNode=slowNode.getNext();
      if(!flag){
        fastNode=fastNode.getNext().getNext();
        flag=true;
      }else{
        flag=false;
      }
    }
    return slowNode;
  }
  
  

  
}
