Since: PMD 1.9

The method clone() should only be implemented if the class implements the Cloneable interface with the exception of a final method that only throws CloneNotSupportedException.

Example(s):
```
public class MyClass {
 public Object clone() throws CloneNotSupportedException {
  return foo;
 }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/clone.html#CloneMethodMustImplementCloneable)
