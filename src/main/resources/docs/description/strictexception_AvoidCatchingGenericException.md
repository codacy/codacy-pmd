Avoid catching generic exceptions such as NullPointerException, RuntimeException, Exception in try-catch block

Ex:
   
package com.igate.primitive;
    
public class PrimitiveType {
    
  public void downCastPrimitiveType() {
    try {
      System.out.println(" i [" + i + "]");
    } catch(Exception e) {
      e.printStackTrace();
    } catch(RuntimeException e) {
      e.printStackTrace();
    } catch(NullPointerException e) {
      e.printStackTrace();
    }
  } 
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strictexception.html#AvoidCatchingGenericException)
