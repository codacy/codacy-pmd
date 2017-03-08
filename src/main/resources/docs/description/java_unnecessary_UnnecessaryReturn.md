Since: PMD 1.3

Avoid the use of unnecessary return statements.

Example(s):
```
public class Foo {
  public void bar() {
    int x = 42;
    return;
  }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/unnecessary.html#UnnecessaryReturn)
