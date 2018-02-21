Since: PMD 6.0.0

Empty If Statement finds instances where a condition is checked but nothing is done about it.

Example(s):
```
public class Foo {
  public void bar(Integer x) {
    if (x == 0) {
      // empty!
    }
  }
}
```
