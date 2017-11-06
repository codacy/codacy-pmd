Since: PMD 1.9

The method clone() should only be implemented if the class implements the Cloneable interface with the exception of
a final method that only throws CloneNotSupportedException.

The rule can also detect, if the class implements or extends a Cloneable class.

Example(s):
```
public class MyClass {
 public Object clone() throws CloneNotSupportedException {
  return foo;
 }
}
```
