Since: PMD 2.1

Do not use protected fields in final classes since they cannot be subclassed.
Clarify your intent by using private or package access modifiers instead.

Example(s):
```
public final class Bar {
  private int x;
  protected int y;  // bar cannot be subclassed, so is y really private or package visible?
  Bar() {}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#AvoidProtectedFieldInFinalClass)
