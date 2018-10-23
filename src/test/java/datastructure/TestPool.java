package datastructure;

import org.junit.Before;
import org.junit.Test;
import color.pool.BasicSingleton;

public class TestPool {

  private BasicSingleton basicSingleton;
  
  @Before
  public void init(){
    basicSingleton=BasicSingleton.getInstance();
  }
  
  @Test
  public void testPool() {
    for(int i=0;i<99;i++){
      System.out.println(basicSingleton.getColor().getName());
    }
  }

}
