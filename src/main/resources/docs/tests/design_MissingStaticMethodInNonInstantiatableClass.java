//#Patterns: design_MissingStaticMethodInNonInstantiatableClass

//#Warn: design_MissingStaticMethodInNonInstantiatableClass
public class Foo {
  private Foo() {}
  void foo() {}
}

public class Bar {
    public Bar() {}
    void foo() {}
}