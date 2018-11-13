package ds.list.single;

import ds.list.node.Node;

public class PalindromeList {

  public static boolean checkForPalindrome(Node head){
    
    Node middle=getMiddle(head);
    System.out.println("middle is ::"+middle);
    Node revrse=reverse(middle);
    Singly.printList(revrse);
    int len=Singly.listLength(head);
    while(head!=middle ){
      System.out.println("Comapring ::"+head +" with "+revrse);
      if(head.getData().equals(revrse.getData())){
        head=head.getNext();
        revrse=revrse.getNext();
      }else{
        return false;
      }
    }
    System.out.println("Is Palindrome...");
    return true;
  }

  private static Node reverse(Node head) {
   Node curHead=head;
   Node temp=null;
   while(head!=null){
     curHead=head;
     head=head.getNext();
     curHead.setNext(temp);
     temp=curHead;
   }
    return curHead;
  }

  private static Node getMiddle(Node head) {
   Node fast=head,slow=head;
   boolean flag=true;
   while(fast.getNext()!=null){
     
     if(flag){
       fast=fast.getNext();
       slow=slow.getNext();
       flag=!flag;
     }else{
       fast=fast.getNext();
       flag=!flag;
     }  
     
   }
   
   return slow;
  }
  
}
