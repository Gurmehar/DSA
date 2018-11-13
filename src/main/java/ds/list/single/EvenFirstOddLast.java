package ds.list.single;

import ds.list.node.IntNode;

public class EvenFirstOddLast {

  public static IntNode sort(IntNode head){
    IntNode curNode=head,odd=null,even=null;
    IntNode evenHead=null,oddHead=null;
    while(curNode!=null){      
      if(curNode.getData()%2==0){
        if(evenHead==null){
          evenHead=curNode;
          even=curNode;          
        }
        else{
          even.setNext(curNode);
          even=curNode;
         
          
        }
      }else{
        if(oddHead==null){
          oddHead=curNode;
          odd=curNode;
        }else{
          odd.setNext(curNode);
          odd=curNode;
          
          
        }
      }
      curNode=curNode.getNext();
      
      
    }
    odd.setNext(null);
    System.out.println("Odd is "+odd);
    even.setNext(oddHead);
     return evenHead;  
  }
  
    
}
