package ds.stack;

public class Precedence {

  public static int getPrec(String c){
    switch(c){
      case "{":
      case "}":
      case "[":
      case "]":
      case "(":
      case ")":
        return 100;
      case "*":
      case "/":
      case "%":
        return 99;
      case "+":
      case "-":
        return 98;
        
        default :return 4;
        
    }
  }
  
  public static boolean isOperator(String c){
    
    return (c.contains("+") || c.contains("*") || c.contains("/") || c.contains("-") );
  }
  
  
  public static boolean isParenthesis(String c){
    return (c.contains("{") ||c.contains("}")||c.contains("[")||c.contains("]")||c.contains("(") ||c.contains(")"));
    
  }
  
  public static boolean isOpenParenthesis(String c){
   
    return (c.contains("{") ||c.contains("(")||c.contains("["));
  }
  
  public static boolean isClosedParenthesis(String c){
   
    return (c.contains("]")||c.contains("}") ||c.contains(")"));
  }

  public static int calculate(String pop, String exp, String str) {
    System.out.println(pop+" "+exp+" "+str);
    switch(str){
      case"+":
        return (Integer.parseInt(pop) +Integer.parseInt(exp));
      case"*":
        return (Integer.parseInt(pop) *Integer.parseInt(exp));
      case"-":
        return (Integer.parseInt(pop) -Integer.parseInt(exp));
      case"/":
        return (Integer.parseInt(pop) /Integer.parseInt(exp));
      case"%":
        return (Integer.parseInt(pop) /Integer.parseInt(exp)); 
    }
    return 0;
  }
  
}
