package ds.stack;

public class SymbolMatching {
  
  public static boolean balanceSymbol(String pattern){
    Stack stack=null;
    Node node=new Node();
    
    for(String c:pattern.split("")){
      if(c.equals("[") ||c.equals("{")||c.equals("(")){
        if(stack==null){
          node.setData(c);
          stack= new Stack(node);
        }else{
          stack.push(""+c);
        }
      }if(c.equals("]") ||c.equals("}")||c.equals(")")){
        String poped=stack.pop();
        if(poped.equals("(") && c.equals(")")){
          continue;
        }
        if(poped.equals("[") && c.equals("]")){
          continue;
        }
        if(poped.equals("{") && c.equals("}")){
          continue;
        }
        System.out.println("Item  "+c+ " not matching with poped item :-: "+poped);
        return false;        
      }
      
    }
    System.out.println(stack.length());
    return true;    
  }
  
  

}
