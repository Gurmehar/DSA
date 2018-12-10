package ds.stack;

public class CalculateInFix {
  
  public static int calculate(String infix){
    String []infixArr=infix.split("");
    int val=0;
    Stack operator = new Stack(null);
    Stack operand = new Stack(null);
    for(int i=0;i<infixArr.length-1;i++){
      String str= infixArr[i];
      String nxt=infixArr[i+1];
      if(Precedence.isOperator(str)){
        if(Precedence.isOpenParenthesis(nxt)){
          operator.push(str);        
        }else{
            
          operand.push(Precedence.calculate(operand.pop(), nxt, str)+"");
          System.out.println("operand ::"+operand);
          i++;
        }
      }else if(!Precedence.isOperator(str) && !Precedence.isParenthesis(str)){
          operand.push(str);
        }else if(Precedence.isOpenParenthesis(str)){
          operator.push(str);
        }else{
          if(Precedence.isClosedParenthesis(str)){
            
            while( !operator.isEmpty()){
              System.out.println("operand in Else :: "+operand);
              str=operator.pop();
              if(!Precedence.isOpenParenthesis(str)){
                String val1=operand.pop();
                String val2=operand.pop();
                operand.push(Precedence.calculate(val2, val1,str)+"");
                
              }          
              
            }
          }
        }
    
    }
    
    while(!operator.isEmpty()){
      String str=operator.pop();
      if(!Precedence.isOpenParenthesis(str)){
        String val1=operand.pop();
        String val2=operand.pop();
        operand.push(Precedence.calculate(val2, val1,str)+"");
        
      } 
      
    }
    
    System.out.println(operand);
    return 0;
  }

  
  
}
