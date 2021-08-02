//#Patterns: category_java_bestpractices_AvoidReassigningParameters

public class Foo {
  private void foo(String bar) {
    //#Warn: category_java_bestpractices_AvoidReassigningParameters
    bar = "something else";
  }

    private void foo2(String bar) {
        String barLocal = "something else";
    }
}
