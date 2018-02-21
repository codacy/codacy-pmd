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
