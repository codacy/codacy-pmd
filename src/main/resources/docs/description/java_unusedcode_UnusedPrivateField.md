Since: PMD 0.1

Detects when a private field is declared and/or assigned a value, but not used.

Example(s):
```
public class Something {
  private static int FOO = 2; // Unused
  private int i = 5; // Unused
  private int j = 6;
  public int addOne() {
    return j++;
  }
}
```
