package ds.list.single;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ds.list.node.Node;


public class TestSingly {
  
  Node headNode;
  Singly singly;
  
  @Before
  public void init(){
    headNode=new Node();
    Node secondNode= new Node();
    secondNode.setData("2");
    secondNode.setNext(null);
    headNode.setData("1");
    
    headNode.setNext(secondNode);
    singly= new Singly();
    System.out.println("Initialized..");
  }
  
  
 // @Test
  public void testInsertAtEnd(){
    Node node= new Node();
    node.setData("3");
    node.setNext(null);
    headNode=singly.addNodeAtEnd(headNode, node);
    System.out.println(singly.printList(headNode));
  }
  
 // @Test
  public void testInsertInMiddle() throws Exception{
    Node node= new Node();
    node.setData("4");
    node.setNext(null);
    headNode=singly.addNodeAtMiddle(headNode, node,1);
    System.out.println(singly.printList(headNode));
  }
  
 // @Test
  public void removeHeadNode() throws Exception{
    Node node= new Node();
    node.setData("4");
    node.setNext(null);
    headNode=singly.addNodeAtEnd(headNode, node);
    
    headNode=singly.removeHeadNode(headNode);
    System.out.println(singly.printList(headNode));
    
  }
  
  //@Test
  public void removeEndNode() throws Exception{
    Node node= new Node();
    node.setData("4");
    node.setNext(null);
    headNode=singly.addNodeAtStart(headNode, node);
    System.out.println(singly.printList(headNode));
    headNode=singly.removeLastNode(headNode);
    System.out.println(singly.printList(headNode));
    
  }
  
  @Test
  public void removeMiddleNode() throws Exception{
    Node node= new Node();
    node.setData("4");
    node.setNext(null);
    headNode=singly.addNodeAtStart(headNode, node);
    node= new Node();
    node.setData("5");
    node.setNext(null);
    headNode=singly.addNodeAtEnd(headNode, node);
    System.out.println(singly.printList(headNode));
    headNode=singly.removeNodeInModdle(headNode, 2);
    System.out.println(singly.printList(headNode));
  }
  
  
  

}
