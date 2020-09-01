Since: PMD 1.0

A method should have only one exit point, and that should be the last statement in the method.

Example(s):
```
public class OneReturnOnly1 {
  public String foo(int x) {
    if (x > 0) {
      return "hey";   // first exit
    }
    return "hi";    // second exit
  }
}
```
