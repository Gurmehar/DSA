package ds.stack;

public class Stack {
  
  private Node head;
  
  public Stack(Node head){
    this.head=head;
  }

  public  Node push(String data){
    if(this.head==null){
      this.head=new Node(data);
    }else{
      Node newNode= new Node(data);
      newNode.setNext(this.head);
      this.head=newNode;
    }
    return head;
  }
  
  public  String pop(){
    if(head==null){
      return null;
    }
    Node temp=head;
    head=head.getNext();
    temp.setNext(null);    
    return temp.getData();
  }
   public void delete(){
     Node temp=null;
     while(this.head!=null){
       temp=this.head;
       this.head=this.head.getNext();
       temp=null;
     }
   }
   
   public String top(){
     if(head==null){
       return  null;
     }
     return  head.getData();
    
   }
   
   public boolean isEmpty(){
    return head==null;
   }
   
   public int length(){
     Node currHead=this.head;
     int i=0;
     while(currHead.getNext()!=null){
       currHead=currHead.getNext();
       i++;
     }
     return i;
   }
   
   public void print(){
     Node node=head;
     while(head!=null){
       System.out.print("[ "+head.getData()+" ]");
       head=head.getNext();
       
     }
     System.out.println();
   }

  @Override
  public String toString() {
    return "Stack [head=" + head + ", Next="+head.getNext()+"]";
  }
   
   
  
  
  
}
