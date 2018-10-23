package chat;

public class TestGraph {
  public static final  int Default=1;
  public static final  int YES=2;
  public static final  int NO=3;
 
  public static void main(String[] args) {
      new ChatGraph(new int[21][21], 5);
      new ChatGraph(new int[21][21], 7);
     // new ChatGraph(graphPopulationArray, 6);
     
     System.out.println(ChatGraph.versionChatMap.get(5));
     System.out.println(ChatGraph.versionChatMap.get(7));
     System.out.println(ChatGraph.versionChatMap.get(5).getEdge("E4",NO ));
     System.out.println(ChatGraph.versionChatMap.get(7).getEdge("E4",NO ));
  }
}
