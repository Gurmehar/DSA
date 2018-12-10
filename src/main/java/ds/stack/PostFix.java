package ds.stack;

public class PostFix {

  private Stack stack;
  
    public PostFix(Stack stack) {
      this.stack= stack;
    }
  
    private String postFix="";

  public String toPostFix(String infix) {
    this.stack.delete();
    String [] infixArr=infix.split("");    
    
    for (String string : infixArr) {   
    
      //System.out.println("Character picked is "+string);
      if(!Precedence.isOperator(string) && !Precedence.isParenthesis(string)){
        postFix=postFix+string;
        //System.out.println("First If ::"+postFix);
      }else{
        if(Precedence.isClosedParenthesis(string)){
          while(string!=null && (!this.stack.isEmpty() && !Precedence.isOpenParenthesis(string))){
            string=stack.pop();
            if(!Precedence.isParenthesis(string)){
              postFix=postFix+string;
              //System.out.println("Second If ::"+postFix);
              
            }
          }
         
        }else{
          String popEle=this.stack.top();          
          while((popEle!=null) && (Precedence.getPrec(popEle)>=Precedence.getPrec(string) && !this.stack.isEmpty() 
              && !Precedence.isOpenParenthesis(popEle))){
            //System.out.println("Under  else while with popele "+popEle );
            popEle=this.stack.pop();
            if(popEle!=null  )
            postFix=postFix+popEle;
          }
          //System.out.println("Under  else while with popele "+popEle +" string "+string );
          this.stack.push(string);
        }
      }
      
      
    }
    while(!this.stack.isEmpty()){
      postFix=postFix+this.stack.pop();
    }
    
    return postFix;    
  }
  
  public int calculatePostFix(String exp){
    int val=0;
    this.stack.delete();
    String expArr[]=exp.split("");
    for(String str:expArr){
      
      if(Precedence.isOperator(str)){
        exp=this.stack.pop();
        val=Precedence.calculate(this.stack.pop(),exp,str);
        this.stack.push(""+val);
      }else{
        this.stack.push(str);
      }
    }
    
    return val;
  }
  
  
  public static void main(String[] args) {
    Stack stack = new Stack(new Node());
    PostFix pf= new PostFix(stack);
    //System.out.println(pf.toPostFix("A*B+C+D-E"));
    System.out.println(pf.toPostFix("A*B-(C+D)+E)"));
    pf.stack.delete();
    pf.postFix="";
    String str=pf.toPostFix("5*4+9+(3-7)");
    System.out.println(str);
    System.out.println(pf.calculatePostFix(str));
  }
}
