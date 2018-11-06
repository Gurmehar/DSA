package ds.towers.honai;

public class Towers {
  
  private void moveTowers(int n,char source,char dest,char aux){
    /**if only 1 disk, make the move and return */
    if(n==1){
      System.out.println("Move Dist from Source to Dest"+source+" :: "+dest);
      return;
    }
    
    /**Move top n-1 disk from source to aux */
    moveTowers( n-1,source,aux,dest);
    System.out.println("Moving disk  from source to aux");
    
    /**Move top n-1 disk from aux to dest */
    moveTowers( n-1,aux,dest,source);
    
    
  }

}
