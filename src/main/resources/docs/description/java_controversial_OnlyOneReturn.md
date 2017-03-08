Since: PMD 1.0

A method should have only one exit point, and that should be the last statement in the method.

Example(s):
```
public class OneReturnOnly1 {
  public void foo(int x) {
    if (x > 0) {
      return "hey";   // first exit
    }
    return "hi";	// second exit
  }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/controversial.html#OnlyOneReturn)
