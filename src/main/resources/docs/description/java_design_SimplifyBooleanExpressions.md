Since: PMD 1.05

Avoid unnecessary comparisons in boolean expressions, they serve no purpose and impacts readability.

Example(s):
```
public class Bar {
  // can be simplified to
  // bar = isFoo();
  private boolean bar = (isFoo() == true);

  public isFoo() { return false;}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#SimplifyBooleanExpressions)
