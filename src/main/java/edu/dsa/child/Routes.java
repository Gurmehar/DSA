package edu.dsa.child;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * CitiBank Question
 * app.codility.com
 * */


public class Routes {
  
  public int solution(int[] A) {
   List<Integer> intList= new ArrayList<Integer>();
   if(A.length>=25){
     return 25;
   }
   Arrays.sort(A);
  
   
   for(int i=0;i<A.length;i++){
     intList.add(A[i]);
   }
   
   if(intList.size()>3){
   return checkFor7Days(intList);
   }else{
     return intList.size()*2;
   }
   
   
   
  }

  private int checkFor7Days(List<Integer> list) {
    int j=1,i=0,k=0;
    int sevenCount=0;
    Set<Integer>sevenRoute=new HashSet<Integer>();
    Set<Integer>singleRoute=new HashSet<Integer>();
    System.out.println("size is ::"+list.size());
    
    while(/*k<list.size()*/j<=list.size()){    
      
      //System.out.println(list.get(i)+" - "+list.get(i+j));
      if(j!=list.size() && list.get(j)-list.get(i)<=6 ){
       System.out.println(list.get(i)+" - "+list.get(j));
        sevenRoute.add(list.get(i));
        sevenRoute.add(list.get(j));        
        j++;
        
      }else{
        if(sevenRoute.size()>3){
          sevenCount++;
          System.out.println("sevenRoute:: "+sevenRoute);
           //i=i<j?j:(i+j);
          i=j;
          j++;
          singleRoute.removeAll(sevenRoute);
          sevenRoute.clear();
          k++;
          System.out.println("i::"+i +" ,j::"+j+" ,k::"+k);
        }else{          
          singleRoute.add(list.get(i));
          i++;
          j=i+1;          
          sevenRoute.clear();
          System.out.println("singleRoute :::"+singleRoute);
          k++;
          System.out.println("i::"+i +" ,j::"+j+" ,k::"+k);
        }
       
      }
      
    }
    System.out.println("sevenCount:: "+sevenCount+"  singleRoute :::"+singleRoute.size());
   return sevenCount*7+singleRoute.size()*2;
  }
  
  public static void main(String[] args) {
    Routes t= new Routes();
    int arr[]={1,3,5,7,10,17,22,23,24,25,29,30,31};
   System.out.println( t.solution(arr));
  }
}



