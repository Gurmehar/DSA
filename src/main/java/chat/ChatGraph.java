package chat;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.log4j.Logger;



public class ChatGraph {
  
  private static Logger log = Logger.getLogger(ChatGraph.class);
  private  int[][] graphPopulationArray;
  private  Map<Integer, String> indexQuestionMap = new LinkedHashMap<Integer, String>();
  private  Map<String, Integer> questionIndexMap = new LinkedHashMap<String, Integer>();
  private  int version=0;
  private Graph graph;
  
  public static final  int Default=1;
  public static final  int YES=2;
  public static final  int NO=3;
 
  
  

 public static Map<Integer,ChatGraph> versionChatMap= new LinkedHashMap<Integer, ChatGraph>();
  
  public ChatGraph(int[][] graphPopulationArray,int version) {
    super();
    if(!versionChatMap.containsKey(version)){        
      this.graphPopulationArray = graphPopulationArray;      
      this.version=version;   
      this.graph= new Graph(graphPopulationArray.length);
      log.info(" Graph is ::"+graph);
      populateMap();
      createRouteBasedOnVersion(this.version);     
      printMatrix();
      versionChatMap.put(version, this);
    }
    
    
  
    
  }

  /**
   * populates Map and Reverse Map 
   * used for Finding Question with Index 
   * and vice-versa 
   */
  private void populateMap() {
    for (int i = 0; i < graphPopulationArray.length; i++) {
      indexQuestionMap.put(i, "E" + i);
      questionIndexMap.put("E" + i, i);

    }
    log.info("indexQuestionMap :" + indexQuestionMap);
    log.info("questionIndexMap :: " + questionIndexMap);
    }
  
  public void printMatrix() {

    for (int i = 0; i < graphPopulationArray.length; i++) {
      for (int j = 0; j < graphPopulationArray.length; j++) {
        if (graphPopulationArray[i][j] > 0) {
          addEdge( i, j, graphPopulationArray[i][j]);
          log.info("Added Packet"+ i + " " + j + " " + graphPopulationArray[i][j]);          
        }
      }
    }

  }
  
  public  void addEdge( int src, int dest, int weight) {
   Node edge = new Node(src, dest, weight);
    graph.adjListArray[src].add(edge);
  }
  
  
  public  String  getEdge(String questionId,int weight){
    int src=questionIndexMap.get(questionId);
    if(src<graphPopulationArray.length){
        
        LinkedList<Node> chatGraphList=graph.adjListArray[src];
        log.info("chatGraphList {} "+ chatGraphList);
        for (Node node : chatGraphList) {
            if(node.getWeight() == weight){
                log.info("Next Chat Dto Packet ::  "+node+"   "+ indexQuestionMap.get(node.getDest()));
                //return  questionDtoMap.get(indexQuestionMap.get(chatGraph.getDest()));
               // String id=indexQuestionMap.get(node.getDest());
                return indexQuestionMap.get(node.getDest());
               /* return (new PsychometricChatDto.Builder()
                    .chat(ChatUtils.openEndQuestionMap.get(id))                         
                    .scneraioId(id)
                    .interim(ChatUtils.questionInterimMap.containsKey(id)
                            ? ChatUtils.questionInterimMap.get(id) : "")
                    .psychometricRole(PsychometricRole.NONE)
                    .psychometricChatType(ChatUtils.idChatTypeMap.get(id))
                    .build());*/
            }
                
        }           
    }
    //return  new PsychometricChatDto.Builder().build();
    return "";
}
  
  private void createRouteBasedOnVersion(int version){
    
   log.info("Populating for Version ::"+version);
    graphPopulationArray[0][1] = Default;
    graphPopulationArray[1][2] = Default;
    graphPopulationArray[2][3] = Default;
    graphPopulationArray[3][4] = Default;
    graphPopulationArray[4][5] = YES;
    
    if (version <=6) {
      graphPopulationArray[4][6] = NO;// question if email does not exists
      graphPopulationArray[5][6] = Default;// question if email does exists

    }else{//Sprint 50
      graphPopulationArray[4][20] = NO;// question if email does not exists
      graphPopulationArray[5][20] = Default;// question if email does exists
      graphPopulationArray[20][6] = Default;// question about Home Location
    }
    
    
    graphPopulationArray[6][7] = Default;// role question

    graphPopulationArray[7][8] = YES;// Text Message
    graphPopulationArray[7][16] = NO;// Text Message -Psychometric
                                    // Begins--noEXperience

    graphPopulationArray[8][9] = Default;/// company Name

    graphPopulationArray[9][10] = Default;// Job Role
    graphPopulationArray[10][11] = Default;// Job Title
    graphPopulationArray[11][12] = Default;// is this current Job
    graphPopulationArray[12][13] = Default;// start date
    graphPopulationArray[13][14] = NO;// end date-- based on answer of current job
    graphPopulationArray[13][15] = YES;// if current job
    
    graphPopulationArray[14][15] = Default;//after end date
    
    graphPopulationArray[15][17] = NO;// more experience -No
    graphPopulationArray[15][9] = YES;// more experience --yes
    graphPopulationArray[16][17] = Default;
    graphPopulationArray[17][18] = Default;
    graphPopulationArray[18][19] = Default;
    
    
  }

  @Override
  public String toString() {
    return "ChatGraph [version=" + version + ", graph=" + graph + "]";
  }

 
  
  
  

}
