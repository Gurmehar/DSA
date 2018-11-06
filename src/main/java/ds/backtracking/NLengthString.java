package ds.backtracking;

public class NLengthString {
/**Generate all the strings of length n drawn from 0...k-1 */
  //String prefix="";
  char set[]=new char[]{'a','b','c'};
  
  
  private void k_String(int len, int k,String prefix){
    if(k<1){
      System.out.println(prefix);
      return;
    }else{
      
      for(int i=0;i<len;i++){
        String newPrefix = prefix + set[i]; 
        
        k_String(len, k-1,newPrefix);
      }
      
    }
  }
  
  public static void main(String[] args) {
    new NLengthString().k_String(3, 2,"");
  }
}
