Since: PMD 1.04

Each non-static class should declare at least one constructor.
Classes with solely static members are ignored, refer to [UseUtilityClassRule](pmd_rules_java_design.html#useutilityclass) to detect those.

Example(s):
```
public class Foo {
   // missing constructor
  public void doSomething() { ... }
  public void doOtherThing { ... }
}
```
