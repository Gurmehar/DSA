package ds.stack;

import java.util.Stack;

public class FindLargestRectangleInHistogram {
  
  //public static GenericStack<StackItem> genericStack= new GenericStack<StackItem>(null);
  
  public static Stack<StackItem>  genericStack =new Stack<StackItem>();
  
  
  public static void findRect(int []histoArr){
    
    int maxArea=0,curArea=0;
    genericStack.push(new StackItem(Integer.MIN_VALUE,-1));
    for(int i=0;i<histoArr.length;i++){
      
        if(genericStack.peek().height<histoArr[i]){
          genericStack.push(new StackItem(histoArr[i], i+1));
          continue;
        }
        
        while(genericStack.size()>1 ){
         StackItem  stackItem=genericStack.peek();
          curArea=stackItem.height*stackItem.index;
          if(curArea>maxArea){
            maxArea=curArea;
          }
          if(stackItem.getHeight()>genericStack.get(genericStack.size()-2).getHeight()){
            break;
          }
          genericStack.pop();
        }
    
     }
      System.out.println(maxArea);
  }
}

  
//---//  
class StackItem{
  int height;
  int index;
  
  public StackItem(int height, int index) {
    super();
    this.height = height;
    this.index = index;
  }
  public int getHeight() {
    return height;
  }
  public void setHeight(int height) {
    this.height = height;
  }
  public int getIndex() {
    return index;
  }
  public void setIndex(int index) {
    this.index = index;
  }
  
}
