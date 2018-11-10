package ds.list.single;
import ds.list.node.Node;

public class StackImpl {
  private Node head;



  public StackImpl(Node head) {
    super();
    this.head = head;
  }

  public Node push(Node newNode) throws Exception {
    if (newNode == null) {
      throw new Exception("New Elements is Null..");
    }

    if (this.head == null) {
      return newNode;
    }
    newNode.setNext(this.head);
    this.head = newNode;
    return this.head;
  }

  public Node pop() throws Exception {
    if (this.head == null) {
      throw new Exception("Empty stack Cant Pop..");
    }

    Node curNode = this.head;
    this.head = this.head.getNext();
    return curNode;

  }



}
