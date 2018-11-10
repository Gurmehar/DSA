package ds.list.node;

public class NodeDLL {
  private Object data;
  private NodeDLL next;
  private NodeDLL previous;
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }
  public NodeDLL getNext() {
    return next;
  }
  public void setNext(NodeDLL next) {
    this.next = next;
  }
  public NodeDLL getPrevious() {
    return previous;
  }
  public void setPrevious(NodeDLL previous) {
    this.previous = previous;
  }
  @Override
  public String toString() {
    return "NodeDLL [data=" + data +  "]";
  }
  
  
  
  
}
