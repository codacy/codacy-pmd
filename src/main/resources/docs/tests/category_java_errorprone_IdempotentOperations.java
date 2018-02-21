//#Patterns: category_java_errorprone_IdempotentOperations
      
public class Foo {
 public void bar() {
  int x = 2;
  //#Warn: category_java_errorprone_IdempotentOperations
  x = x;
 }
}

