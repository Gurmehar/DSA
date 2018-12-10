package ds.stack;

import java.util.Arrays;

public class Spans {

  
  public static int[] findSpans(int  []weekArray){
    int []spans= new int[weekArray.length];
   int j=1;
   
    for(int i=0;i<weekArray.length;i++){
      j=1;
      while(j<=i && weekArray[i]>weekArray[i-j])
               j++;
        
        spans[i]=j;
      }
    
    
    System.out.println(Arrays.toString(spans));
    
    return spans;
  }
  
  
  
  public static int[] findSpanswithStack(int [] weekArr){
    int spans[]=new int[weekArr.length];
    java.util.Stack<Integer> stack = new java.util.Stack();
    int p=-1;
    for(int i=0;i<weekArr.length;i++){
      
      while(!stack.isEmpty() && weekArr[i]>weekArr[stack.peek()]){
        System.out.println("poping :: "+ stack.pop());
      }
      
      if(stack.isEmpty())
        p=-1;
      else
        p=stack.peek();
      System.out.println("p  is:: "+p+" pushing i :"+i);
      spans[i]=i-p;
      
      stack.push(i);      
    }
    System.out.println(Arrays.toString(spans));
    return spans;
  }
  
  
  public static void main(String[] args) {
    //findSpans(new int[]{5,3,5,7,1,2});
    findSpanswithStack(new int[]{2,3,5,7,1,2});
  }
  
  
  
  
  
  
  
}
