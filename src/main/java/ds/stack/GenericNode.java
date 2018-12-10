package ds.stack;

public class GenericNode <T> {
  
  private T data;
  private GenericNode<T> next;
  
  public GenericNode(T data2) {
    this.data=data2;
  }
  public T getData() {
    return data;
  }
  public void setData(T data) {
    this.data = data;
  }
  public GenericNode<T> getNext() {
    return next;
  }
  public void setNext(GenericNode<T> next) {
    this.next = next;
  }
  @Override
  public String toString() {
    return "GenericNode [data=" + data + ", next=" + next + "]";
  }
  
  
  
   
  

}
