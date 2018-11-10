package ds.list.doubly;

import ds.list.node.NodeDLL;

public class Doubly {

  
  public NodeDLL addAtStart(NodeDLL head,NodeDLL newNode){
    if(head==null){
      return newNode;
    }
    NodeDLL currNode=head;
    newNode.setPrevious(null);
    newNode.setNext(currNode);
    currNode.setPrevious(newNode);
    
    return newNode;
    
  }
  
  public NodeDLL addAtEnd(NodeDLL head,NodeDLL newNode){
    if(head==null){
      return newNode;
    }
    NodeDLL currNode=head;
    while(currNode.getNext()!=null){
      currNode=currNode.getNext();
    }
    currNode.setNext(newNode);
    newNode.setPrevious(currNode);
    newNode.setNext(null);
    
    return head;
    
  }
  
  public NodeDLL insertInBetween(NodeDLL head,NodeDLL newNode,int position) throws Exception{
    if(head==null){
      throw new Exception("Cant Add Node in Middle List is Empty...");
    }
    if(position==0){
      return addAtStart(head, newNode);
    }
    
    NodeDLL currNode=head;
    for(int i=0;i<position-1;i++){
      currNode=currNode.getNext();
    }
    newNode.setNext(currNode.getNext());
    newNode.setPrevious(currNode);
    currNode.setNext(newNode);
    
    return head;
    
  }
  
  public NodeDLL removeFromBegining(NodeDLL head) throws Exception{
    if(head==null){
      throw new Exception("Cant Remove Node List is Empty...");
    }
    NodeDLL currNode=head;
    currNode =currNode.getNext();
    currNode.setPrevious(null);
    head=null;
    return currNode;
  }
  public NodeDLL removeAtEnd(NodeDLL head) throws Exception{
    if(head==null){
      throw new Exception("Cant Remove Node List is Empty...");
    }
    NodeDLL currNode=head;
    while(currNode.getNext()!=null){
      currNode=currNode.getNext();
    }
    NodeDLL previousNode=currNode.getPrevious();
    previousNode.setNext(null);
    currNode=null;
    return head;
  }
  
  public NodeDLL removeInMiddle(NodeDLL head,int position) throws Exception{
    if(head==null){
      throw new Exception("Cant Remove Node List is Empty...");
    }
    
    if(position==0){
      return removeFromBegining(head);
    }
    NodeDLL currNode=head;
    for(int i=0;i<position;i++){
      currNode=currNode.getNext();
    }
    NodeDLL previousNode=currNode.getPrevious();
    previousNode.setNext(currNode.getNext());
    currNode=previousNode.getNext();
    currNode.setPrevious(previousNode);
    return head;    
    
  }
  
  public void printData(NodeDLL node){
    NodeDLL curNode=node;
    int length=length(node),i=0;
    while(i<=length){
      System.out.print(curNode);
      curNode=curNode.getNext();
      i++;
    }
    System.out.println();
  }
  
  public int length(NodeDLL node){
    NodeDLL curNode=node;
    int len=0;
    while(curNode.getNext()!=null){
      curNode=curNode.getNext();
      len++;
    }
    return len;
  }
  
  
  
}
