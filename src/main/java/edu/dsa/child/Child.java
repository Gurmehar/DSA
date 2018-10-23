package edu.dsa.child;

import edu.dsa.parent.Parent;

public class Child extends Parent {
  static void check(){
    System.out.println("Child");
  }
  
  public static void main(String[] args) {
    Parent p = new Child();
    ((Child)p).check();
  }
}
