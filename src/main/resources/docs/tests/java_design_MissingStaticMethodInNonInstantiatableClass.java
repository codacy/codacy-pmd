//#Patterns: java_design_MissingStaticMethodInNonInstantiatableClass

//#Warn: java_design_MissingStaticMethodInNonInstantiatableClass
public class Foo {
  private Foo() {}
  void foo() {}
}

public class Bar {
    public Bar() {}
    void foo() {}
}