package ds.list.single;


import ds.list.node.Node;

public class JonitPointOf2List {
  
  public Node findJointPoint(Node head1,Node head2){
    int lenHead1=getLength(head1);
    int lenHead2=getLength(head2);
    
    Node curNode1=null;
    Node curNode2=null;
    int diff=0;
  if(lenHead1>lenHead2){
    diff=lenHead1-lenHead2;
    curNode1=head1;
    curNode2=head2;
  }else{
    diff=lenHead2-lenHead1;
    curNode1=head2;
    curNode2=head1;
  }
    for(int i=0;i<diff;i++){
      curNode1=curNode1.getNext();
    }
    
    while(curNode1!=null&& curNode2!=null){
      if(curNode1.getData()==curNode2.getData()){
       return curNode1;
      }
      
      curNode1=curNode1.getNext();
      curNode2=curNode2.getNext();
    }
     return null;
    
    
    
  }
  
  
  public int getLength(Node head){
    Node curNode=head;
    int len=0;
    while(curNode!=null){
      len++;
      curNode=curNode.getNext();
    }
    return len;
  }

}
