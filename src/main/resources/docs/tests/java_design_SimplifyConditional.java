//#Patterns: java_design_SimplifyConditional
public class Foo {
  void bar(Object x) {
  	//#Warn: java_design_SimplifyConditional
    if (x != null && x instanceof Bar) {
      // just drop the "x != null" check
    }
  }

}
public class Foo2 {
    public void Bar() {


    }
}

