Since: PMD 1.0

Avoid creating deeply nested if-then statements since they are harder to read and error-prone to maintain.

Example(s):
```
public class Foo {
  public void bar(int x, int y, int z) {
    if (x>y) {
      if (y>z) {
        if (z==x) {
         // !! too deep
        }
      }
    }
  }
}
```
