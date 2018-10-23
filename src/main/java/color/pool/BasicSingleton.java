package color.pool;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class BasicSingleton {
  
  private static BasicSingleton basicSingleton;
  private List<Color> colorPool= new ArrayList<Color>();
  private Map<String,Integer> colorMap= new HashMap<String,Integer>();
  private static final Logger log= Logger.getLogger("pool");
  private static final int count=4;
  private BasicSingleton(){
    loadPool();
    
  }
  private void loadPool() {
    for(int i=0;i<4;i++){
      colorPool.add(new Green());
      colorPool.add(new Red());
      colorPool.add(new Blue());
    }
    log.info(""+colorPool.size());
    
    colorMap.put("red", colorMap.containsKey("red")?colorMap.get("red")+count:count);
    colorMap.put("blue", colorMap.containsKey("blue")?colorMap.get("blue")+count:count);
    colorMap.put("green", colorMap.containsKey("green")?colorMap.get("green")+count:count);
   
    
  }
  
  public static BasicSingleton getInstance(){
      if(basicSingleton==null){
        synchronized (BasicSingleton.class) {
          if(basicSingleton==null)
          basicSingleton= new BasicSingleton();
        }
      }
      return basicSingleton;
  }
  
  public Color getColor(){
    Iterator<Color> itr=colorPool.iterator();
    Color color=null;
    while(itr.hasNext()){
      color= itr.next();
      if(colorMap.get(color.getName())>1){
        colorMap.put(color.getName(), colorMap.get(color.getName())-1);
       itr.remove();
       log.info(""+colorMap);
       return color;
      }
    }
    
      log.info("poolEmpty");
      loadPool();
      log.info(this.toString());
      color=getColor();
      
    
    return color;
  }
  
  @Override
  public String toString() {
    return "BasicSingleton [colorPool=" + colorPool + "]";
  }
  

}
