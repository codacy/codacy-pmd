Since: PMD 1.1

If a final field is assigned to a compile-time constant, it could be made static, thus saving overhead 
in each object at runtime.

Example(s):
```
public class Foo {
  public final int BAR = 42; // this could be static and save some space
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#FinalFieldCouldBeStatic)
