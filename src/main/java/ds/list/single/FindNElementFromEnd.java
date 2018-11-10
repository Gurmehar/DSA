package ds.list.single;

import ds.list.node.Node;

public class FindNElementFromEnd {
  
  public Node getNthElement(Node head,int nthPosition) throws Exception{
    if(head==null){
      throw new Exception("Head Empty Cant traverse");
    }
    
    Node curNode=head;
    Node eleNode=null;
    int i=0;
    while(curNode!=null){
      if(i==nthPosition){
        eleNode=curNode;
      }      
      curNode=curNode.getNext();
      i++;
    }
    
    if(eleNode==null){
      throw new Exception(nthPosition+" Does not Exists in List ... ");
    }
    
    return eleNode;
    
    
  }

}
