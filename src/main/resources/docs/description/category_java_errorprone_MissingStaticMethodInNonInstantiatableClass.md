Since: PMD 3.0

A class that has private constructors and does not have any static methods or fields cannot be used.

When one of the private constructors is annotated with one of the annotations, then the class is not considered
non-instantiatable anymore and no violation will be reported.
See the property `annotations`.

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
