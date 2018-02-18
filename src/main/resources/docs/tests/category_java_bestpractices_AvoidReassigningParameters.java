//#Patterns: category_java_bestpractices_AvoidReassigningParameters

public class Foo {
//#Warn: category_java_bestpractices_AvoidReassigningParameters
  private void foo(String bar) {
    bar = "something else";
  }

    private void foo2(String bar) {
        String barLocal = "something else";
    }
}
