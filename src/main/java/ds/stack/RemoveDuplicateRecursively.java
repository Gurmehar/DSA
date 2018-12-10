package ds.stack;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicateRecursively {
  
  
  
  public static void removeAdjcentDuplicates(String str){
    char []arr=str.toCharArray();
    int ptr=-1,i=0;
    while(i<arr.length){
      if(ptr==-1 || arr[ptr]!=arr[i]){
        ptr++;
        arr[ptr]=arr[i];
        i++;
      }else{
        while(i<arr.length && arr[ptr]==arr[i])
          i++;
        
        ptr--;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
  
  public static void main(String[] args) {
    removeAdjcentDuplicates("mississippi");
  }

}
