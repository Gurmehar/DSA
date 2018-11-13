package ds.list.single;

import org.junit.Before;
import org.junit.Test;
import ds.list.node.IntNode;
import ds.list.node.Node;


public class TestSingly {
  
  Node headNode;
  Node one,seven,four;
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
    
    
    
    
       one= new Node("1");
      Node two= new Node("2");
      Node three= new Node("3");
           four= new Node("4");
      Node five= new Node("5");
      Node six= new Node("6");
       seven= new Node("7");
        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);
        five.setNext(six);
        six.setNext(seven);
        
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
  
  //@Test
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
  
  
 // @Test
  public void testAdjacentNodeReversal(){
    one=ReverseNodeInList.reverseAdjacentNodes(one);
    System.out.println(Singly.printList(one));
  }
  
  //@Test
  public void testReverse(){
    one=ReverseSinglyList.reverse(one);
    System.out.println(Singly.printList(one));
  }
  
  //@Test
  public void testCircular() throws Exception{
    seven.setNext(one);
   // Circular.printData(seven);
    FindLoopInList.spiltCircularList(one);
  }
 // @Test
  public void testPalindrome(){
    Node one= new Node("1");
    Node two= new Node("2");
    Node three= new Node("3");
    Node thee= new Node("3");
    Node four= new Node("2");
    Node five= new Node("1");
      one.setNext(two);
      two.setNext(three);
      three.setNext(four);
      thee.setNext(four);
      four.setNext(five);
    
    PalindromeList.checkForPalindrome(one);
  }
  
  //@Test
  public void testList(){
    Node next= new Node("8");   
    //ReverseKNodesInlist.reverse(one, 4);
    Singly.printList(four);
    four =DeleteElementInSingleList.removePointedNode(four);
    Singly.printList(four);
  }
  
 // @Test
  public void testEvenFirstOddLast(){
    IntNode one= new IntNode(1);
    IntNode two= new IntNode(2);
    IntNode three= new IntNode(3);
    IntNode four= new IntNode(4);
    IntNode five= new IntNode(5);
    IntNode six= new IntNode(6);
      one.setNext(two);
      two.setNext(three);
      three.setNext(four);
      four.setNext(five);
      //five.setNext(six);
     six.setNext(null);
    Singly.printList(one);
    one=EvenFirstOddLast.sort(one);
    Singly.printList(one);
  }
  
  @Test
  public void testShuffle(){
    Singly.printList(one);
    one=JumbledList.shuffle(one);
    Singly.printList(one);
  }

}
