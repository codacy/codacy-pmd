Since: PMD 2.0

Avoid idempotent operations - they have no effect.

Example(s):
```
public class Foo {
 public void bar() {
  int x = 2;
  x = x;
 }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#IdempotentOperations)
