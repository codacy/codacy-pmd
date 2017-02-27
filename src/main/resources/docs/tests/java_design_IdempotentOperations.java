//#Patterns: java_design_IdempotentOperations
      
public class Foo {
 public void bar() {
  int x = 2;
  //#Warn: java_design_IdempotentOperations
  x = x;
 }
}

