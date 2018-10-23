package chat;

import java.util.LinkedList;

public  class Graph {
  int vertices;
  LinkedList<Node> adjListArray[];

  public Graph(int vertices) {
      this.vertices = vertices;
      adjListArray = new LinkedList[vertices];
      
      for (int i = 0; i < this.vertices; i++) {
          adjListArray[i] = new LinkedList<Node>();
      }
  }

  @Override
  public String toString() {
    return "Graph [vertices=" + vertices + "]";
  }
  
  
}