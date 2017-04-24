Since: PMD 1.02

A high ratio of statements to labels in a switch statement implies that the switch statement 
is overloaded.  Consider moving the statements into new methods or creating subclasses based 
on the switch variable.

Example(s):
```
public class Foo {
  public void bar(int x) {
    switch (x) {
      case 1: {
        // lots of statements
        break;
      } case 2: {
        // lots of statements
        break;
      }
    }
  }
}
```
