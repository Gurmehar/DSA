package ds.stack;

public class ReverseListUsingStack {
  
  private Stack stack;
  
  public ReverseListUsingStack(Stack stack) {
    this.stack=stack;
  }
  
  public void reverseStack(){
    if(this.stack.isEmpty()){
      return;
    }
    
    String s=this.stack.pop();
    reverseStack();
    addToBottom(s);
  }

  private void addToBottom(String s) {
   if(this.stack.isEmpty()){
     this.stack.push(s);
     return;
   }
   
   String temp=this.stack.pop();
   addToBottom(s);
   this.stack.push(temp);
   
  }
  
  public void print(){
    this.stack.print();
  }

}
