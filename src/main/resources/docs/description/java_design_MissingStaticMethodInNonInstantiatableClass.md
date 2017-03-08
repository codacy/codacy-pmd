Since: PMD 3.0

A class that has private constructors and does not have any static methods or fields cannot be used.

Example(s):
```
// This class is unusable, since it cannot be
// instantiated (private constructor),
// and no static method can be called.

public class Foo {
  private Foo() {}
  void foo() {}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#MissingStaticMethodInNonInstantiatableClass)
