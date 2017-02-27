//#Patterns: java_design_AvoidReassigningParameters

public class Foo {
//#Warn: java_design_AvoidReassigningParameters
  private void foo(String bar) {
    bar = "something else";
  }

    private void foo2(String bar) {
        String barLocal = "something else";
    }
}