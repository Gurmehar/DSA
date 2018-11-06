package ds.backtracking;

import java.util.Arrays;

public class NBitString {
  /**
   * Generate all the strings of n bits. Assume A[ 0.. n – 1] is an array of size n.
       
    */
  private char arrayStr[]=new char[2];
  
  private void binary(int n){
    if(n<1){
      System.out.println("Array  "+Arrays.toString(arrayStr));
    }else{
      arrayStr[n-1]='0';
      binary(n-1);
      arrayStr[n-1]='1';
      binary(n-1);
    }
  }

  public static void main(String[] args) {
    new NBitString().binary(2);
  }
  
}
