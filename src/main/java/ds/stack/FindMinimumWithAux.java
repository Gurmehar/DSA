package ds.stack;

public class FindMinimumWithAux {
  
  private Stack stack;
  private Stack minStack;
  
  public FindMinimumWithAux(Stack stack) {
    this.stack=stack;
    this.minStack=new Stack(null);
  }
  
  public void push(String data){
    this.stack.push(data);
    if(this.minStack.isEmpty()){
      this.minStack.push(data);
    }else{
      
      this.minStack.push((Integer.parseInt(this.minStack.top())< Integer.parseInt(data))
      ?this.minStack.top()
          :data
      );
    }
  }
  
  public void push_SpaceMngt(String data){
    this.stack.push(data);
    if(this.minStack.isEmpty()){
      this.minStack.push(data);
    }else{
      
      if(Integer.parseInt(this.minStack.top())> Integer.parseInt(data)){
        this.minStack.push(data);
      }
    }
  }
    
    public String pop(){
      if(this.stack.top().equals(this.minStack.top())){
        this.minStack.pop();
      }
      return this.stack.pop();
    }
    
    public String getMin(){
      return this.minStack.top();
    }
  
    public void print(){
      System.out.println(this.stack);
      System.out.println(this.minStack);
    }

}
