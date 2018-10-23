package chat;


public class Node {
  
  private int src, dest, weight;  
  
  
  public Node(int src2, int dest2, int weight2) {
    this.src=src2;
    this.dest=dest2;
    this.weight=weight2;
    }
  
  public int getSrc() {
    return src;
  }
  public void setSrc(int src) {
    this.src = src;
  }
  public int getDest() {
    return dest;
  }
  public void setDest(int dest) {
    this.dest = dest;
  }
  public int getWeight() {
    return weight;
  }
  public void setWeight(int weight) {
    this.weight = weight;
  }
  
  @Override
  public String toString() {
    return "Node [src=" + src + ", dest=" + dest + ", weight=" + weight + "]";
  }
  
  
  
}
