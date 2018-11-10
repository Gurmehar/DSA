package ds.list.doubly;

import org.junit.Before;
import org.junit.Test;
import ds.list.node.NodeDLL;

public class TestDoubly {
  
  NodeDLL node;
  Doubly dll;
  
  @Before
  public void init(){
    node= new NodeDLL();
    node.setData("1");
    node.setPrevious(null);
    NodeDLL second= new NodeDLL();
    second.setPrevious(node);
    node.setNext(second);
    second.setNext(null);
    second.setData("2");
    
    dll= new Doubly();
    System.out.println("Initalized ...");
  }
  
  @Test
  public void testInsertion(){
    NodeDLL third= new NodeDLL();
    third.setData("3");
    NodeDLL fourth= new NodeDLL();
    fourth.setData("4");
    try {
      node=dll.addAtEnd(node, third);
      node=dll.insertInBetween(node, fourth, 1);
      dll.printData(node);
      node=dll.removeInMiddle(node, 1); 
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    dll.printData(node);
    
  }
  

}
