//#Patterns: java_design_ImmutableField


public class Foo {
  //#Warn: java_design_ImmutableField
  private int x; // could be final
  public Foo() {
      x = 7;
  }
  public void foo() {
     int a = x + 2;
  }
}

