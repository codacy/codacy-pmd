Since: PMD 2.0

Identifies private fields whose values never change once they are initialized either in the declaration 
of the field or by a constructor.  This helps in converting existing classes to becoming immutable ones.

Example(s):
```
public class Foo {
  private int x; // could be final
  public Foo() {
      x = 7;
  }
  public void foo() {
     int a = x + 2;
  }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#ImmutableField)
