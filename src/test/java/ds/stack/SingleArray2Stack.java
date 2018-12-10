package ds.stack;

public class SingleArray2Stack {
  
  String []arrString= new String[10];
  int stack1Pos=0;
  int stack2Pos=arrString.length-1;
   public SingleArray2Stack() {
   System.out.println(this.arrString.length);
  }
  
  public void stack1Push(String str) throws Exception{
    if(this.stack1Pos>=this.stack2Pos ){
      throw new Exception("Stack1 OverFlow "+ this.stack1Pos +" - Stack 2-> "+this.stack2Pos);
    }
    
    this.arrString[stack1Pos]=str;
    stack1Pos++;
    
    
  }
  
  public void stack2Push(String str) throws Exception{
    if(this.stack2Pos<this.stack1Pos){
      throw new Exception("Stack2 OverFlow "+ this.stack2Pos +" - Stack 1-> "+this.stack1Pos);
    }
    
    this.arrString[stack2Pos]=str;
    System.out.println("Pushed on to "+stack2Pos +" position");
    stack2Pos--;
    
  }
  
  public String popStack1() throws Exception{
    if(this.stack1Pos==0){
      throw new Exception("Stack1 UnderFlow");
    }
    stack1Pos--;
    String s=this.arrString[this.stack1Pos];
    this.arrString[this.stack1Pos]="";
    
    return s;
  }
  
  public String popStack2() throws Exception{
    if(this.stack2Pos==arrString.length){
      throw new Exception("Stack2 UnderFlow");
    }
    stack2Pos++;
    String s=this.arrString[this.stack2Pos];
    this.arrString[this.stack2Pos]="";
    
    return s;
  }
  

}
