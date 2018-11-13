package ds.list.single;

import ds.list.node.Node;

public class ReverseKNodesInlist {
  
  private static boolean hasKNodes(Node head, int k) {
    if(head==null){
      return true;
    }
    int i=0;
    for(i=0;i<=k && head!=null;i++,head=head.getNext()){}
      
    System.out.println(i+ " , "+head);
      if(i==k){
        return true;
      }
    
    return false;
  }

  private static Node getKthPlusNode(int k,Node head){
    if(head==null){
      return head;
    }
    
    Node curNode=null;
    int i=0;
    
    for(i=0,curNode=head;curNode!=null && i<k;i++,curNode=curNode.getNext());
    
    if(i==k && curNode!=null){
      return curNode;
    }
    
    return head.getNext();
  }
  
  
  public static Node reverse(Node head,int k){
    Node curHead=head,temp=null,next=null,newhead=null;
    int i;
    if(k==0||k==1){
      return head;
    }
    
    if(hasKNodes(curHead, k-1)){
      newhead=getKthPlusNode(k-1, curHead);
    }else{
      newhead=head;
    }
    
    while(curHead!=null && hasKNodes(curHead, k)){
        temp=getKthPlusNode(k, curHead);
        i=0;
        while(i<k){
          next=curHead.getNext();
          curHead.setNext(temp);
          temp=curHead;
          curHead=next;
          i++;
        }
    }
    Singly.printList(newhead);
    return newhead;
  }
  
 /* public static Node reverse(Node head,int k){
    Node curHead=head;
    Node head2=head;
    
    int len=Singly.listLength(head);
    System.out.println(len);
    int i=0;
    head=null;
    while(hasKNodes(head,k,curHead)){     
       while(i<k){
         curHead=curHead.getNext();
         i++;
       }
       i=0;
       head2=reverseNodes(head2,curHead);      
       head=append(head,head2);
       System.out.println(" ---");
             
       head2=curHead; 
    }
    Singly.printList(head); 
    System.out.println("K :"+k+" length :"+len);
    return head;
  }

  
  private static Node append(Node head, Node head2) {
    Node temp=head;
    if(temp==null){
      head = head2;
      return head;
    }
    while(temp.getNext()!=null){
      temp=temp.getNext();
    }
    temp.setNext(head2);   
    return head;
    
  }

  private static Node reverseNodes(Node head, Node kNode) {
    Node temp=null;
    Node curNode=null;
    
    while(head!=kNode){
      curNode=head.getNext();
      
      head.setNext(temp);
      temp=head;
      head=curNode;
      
    }
   
   curNode=temp;
  
   //Singly.printList(curNode);
    return curNode;
    
  }
*/
}
