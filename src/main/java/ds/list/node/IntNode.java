package ds.list.node;

public class IntNode {
  
  private int data;
  private IntNode next=null;
  
  public int getData() {
    return data;
  }
  public void setData(int data) {
    this.data = data;
  }
  public IntNode getNext() {
    return next;
  }
  public void setNext(IntNode next) {
    this.next = next;
  }
  
  @Override
  public String toString() {
    return "Node [data=" + data + "]";
  }
  public IntNode() { }
  
  public IntNode(int data) {
    super();
    this.data = data;
  }
  

}
