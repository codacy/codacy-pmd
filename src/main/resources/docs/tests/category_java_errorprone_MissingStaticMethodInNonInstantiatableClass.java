//#Patterns: category_java_errorprone_MissingStaticMethodInNonInstantiatableClass

//#Warn: category_java_errorprone_MissingStaticMethodInNonInstantiatableClass
public class Foo {
  private Foo() {}
  void foo() {}
}

public class Bar {
    public Bar() {}
    void foo() {}
}
