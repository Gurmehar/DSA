package ds.stack;

public class GenericStack<T> {

  private GenericNode<T> head;

  public GenericStack(GenericNode<T> node) {
   
    this.head = node;
  }
  
  
  public  GenericNode<T> push(T data){
    if(this.head==null){
      this.head=new GenericNode(data);
    }else{
      GenericNode<T> newNode= new GenericNode<T>(data);
      newNode.setNext(this.head);
      this.head=newNode;
    }
    return head;
  }
  
  
  public  T pop(){
    if(head==null){
      return null;
    }
    GenericNode<T> temp=head;
    head=head.getNext();
    temp.setNext(null);    
    return temp.getData();
  }
  
  public void delete(){
    GenericNode<T> temp=null;
    while(this.head!=null){
      temp=this.head;
      this.head=this.head.getNext();
      temp=null;
    }
  }
  
  public T top(){
    if(head==null){
      return  null;
    }
    return  head.getData();
   
  }
  
  public boolean isEmpty(){
    return head==null;
   }
  
  public int length(){
    GenericNode<T> currHead=this.head;
    int i=0;
    while(currHead.getNext()!=null){
      currHead=currHead.getNext();
      i++;
    }
    return i;
  }
  
  public void print(){
    GenericNode<T> node=head;
    while(head!=null){
      System.out.print("[ "+head.getData()+" ]");
      head=head.getNext();
      
    }
    System.out.println();
  }


  @Override
  public String toString() {
    return "GenericStack [head=" + head + "]";
  }
  
  
  
}
