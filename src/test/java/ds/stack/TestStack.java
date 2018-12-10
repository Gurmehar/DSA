package ds.stack;

import org.junit.Test;

public class TestStack {
  
  //@Test
  public void testSymbol(){
    String str="{[(A+b)*(C-d)]*[(c-d)]}";
    
    SymbolMatching.balanceSymbol(str);
  }
  
//  @Test
  public void testLength(){
    String str="{[(A+b)*(C-d)]*[(c-d)]}";
    System.out.println(str.length());
    Node head = new Node();
    Stack stack= new Stack(head);
    for(char c: str.toCharArray()){
      stack.push(""+c);
    }
    System.out.println(stack.length());
  }
  
 // @Test
  public void testInfixCalculation(){
    String str="5*4+(3+2)-7";
    //System.out.println(CalculateInFix.calculate(str));
     //str="5*4+3+(2-7)";
    System.out.println(CalculateInFix.calculate(str));
  }
  
  //@Test
  public void testMinimum(){
    FindMinimumWithAux obj= new FindMinimumWithAux(new Stack(null));
    obj.push_SpaceMngt("99");
    obj.push_SpaceMngt("1");
    obj.push_SpaceMngt("2");
    //obj.push_SpaceMngt("0");
    obj.push_SpaceMngt("130");
    
    System.out.println("Min "+obj.getMin());
    obj.print();
    obj.pop();
    System.out.println("Min "+obj.getMin());
    obj.pop();obj.pop();
    System.out.println("Min "+obj.getMin());
  }
  
  //@Test
  public void testReverse(){
    Stack stack = new Stack(null);
    stack.push("1");
    stack.push("14");
    stack.push("9");
    stack.push("3");
    stack.push("0");
    ReverseListUsingStack obj = new ReverseListUsingStack(stack);
    obj.print();
    obj.reverseStack();
    obj.print();
  }
  
  @Test
  public void testSingleArray2Stack() throws Exception{
    SingleArray2Stack obj= new SingleArray2Stack();
    
    obj.stack1Push("1");
    obj.stack1Push("15");
    obj.stack1Push("13");
    obj.stack1Push("21");
    obj.stack1Push("2");
    obj.stack1Push("21");
    
    obj.stack2Push("100");
    obj.stack2Push("101");
    obj.stack2Push("102");
    obj.stack2Push("103");
    obj.stack2Push("104");
    //obj.stack2Push("105");
    
    
    
  }

}
