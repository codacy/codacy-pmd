Since: PMD 3.0

The abstract class does not contain any abstract methods. An abstract class suggests
an incomplete implementation, which is to be completed by subclasses implementing the
abstract methods. If the class is intended to be used as a base class only (not to be instantiated
directly) a protected constructor can be provided prevent direct instantiation.

Example(s):
```
public abstract class Foo {
  void int method1() { ... }
  void int method2() { ... }
  // consider using abstract methods or removing
  // the abstract modifier and adding protected constructors
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#AbstractClassWithoutAbstractMethod)
