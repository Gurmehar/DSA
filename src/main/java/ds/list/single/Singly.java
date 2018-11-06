package ds.list.single;

import ds.list.node.Node;

public class Singly {

  public int listLength(Node headNode) {
    int length = 0;
    Node currNode = headNode;

    while (currNode.getNext() != null) {
      length++;
      currNode = currNode.getNext();
    }
    return length;

  }
  
  public Node addNodeAtStart(Node headNode,Node newNode){    
    if(newNode!=null){
      newNode.setNext(headNode);
      return newNode;
    }
    return headNode;
  }
  
  public Node addNodeAtEnd(Node headNode,Node newNode ){
    Node currNode = headNode;
    
    while (currNode.getNext() != null) {
       currNode = currNode.getNext();
    }
    currNode.setNext(newNode);
    
    return headNode;
  }
  
  public Node addNodeAtMiddle(Node headNode,Node newNode,int position) throws Exception{
    if(headNode==null){
      throw new Exception("Cant Add Node in Middle List is Empty...");
    }
    if(position==0){
      return addNodeAtStart(headNode, newNode);
    }
    Node currNode=headNode;
    for(int i=0;i<position-1;i++){
      currNode =currNode.getNext();
    }
    newNode.setNext(currNode.getNext());
    currNode.setNext(newNode);
    
    return headNode;   
    
  }

  public String printList(Node headNode){
    if(headNode==null){
      return "[]";
    }
    Node currNode=headNode;
    int length=listLength(headNode),i=0;
    String str="";
    while(i<=length){
      str=str+"[ "+currNode.getData()+" ],";
      currNode=currNode.getNext();
      i++;
    }
    return str;
    
  }
  
  public Node removeHeadNode(Node headNode) throws Exception{
    if(headNode==null){
      throw new Exception("Empty...");
    }
    Node currNode=headNode.getNext();
    headNode=null;
    return currNode;
    
  }
  
  public Node removeLastNode(Node headNode) throws Exception{
    if(headNode==null){
      throw new Exception("Empty...");
    }
    Node currNode=headNode;
    Node previousNode=null;
    while(currNode.getNext()!=null){
      previousNode=currNode;
      currNode=currNode.getNext();
    }
    previousNode.setNext(null);
    return headNode;
  }
  
  public Node removeNodeInModdle(Node headNode,int position) throws Exception{
    if(headNode==null){
      throw new Exception("Cant Remove Node in Middle List is Empty...");
    }
    if(position==0){
      return removeHeadNode(headNode);
    }
    
    int i=0,length=listLength(headNode);
    Node currNode=headNode;
    Node previousNode=null;
    while(i<length-1){
      previousNode=currNode;
      currNode=currNode.getNext();
      i++;
    }
    previousNode.setNext(currNode.getNext());
    System.err.println("Node Removed ..."+currNode);
    currNode=null;
       
    return headNode;
    
    
  }
  public static void main(String[] args) {
    int x=3;
    int y=2*++x;
    System.out.println(y);
  }
  

}