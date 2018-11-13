package ds.list.single;

import ds.list.node.Node;

public class DeleteElementInSingleList {
  
  public static Node removePointedNode(Node nodeToDetele){
    if(nodeToDetele==null){
      return nodeToDetele;
    }
    
    if(nodeToDetele.getNext()==null){
      return null;
    }
    Node curNode=nodeToDetele,preNode=null;
    while(curNode.getNext()!=null){
      
      curNode.setData(curNode.getNext().getData());
      preNode=curNode;
      curNode=curNode.getNext();
    }
    
    preNode.setNext(null);
    return nodeToDetele;
  }

}
