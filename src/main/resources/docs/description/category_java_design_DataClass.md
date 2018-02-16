Since: PMD 6.0.0

Data Classes are simple data holders, which reveal most of their state, and
without complex functionality. The lack of functionality may indicate that
their behaviour is defined elsewhere, which is a sign of poor data-behaviour
proximity. By directly exposing their internals, Data Classes break encapsulation,
and therefore reduce the system's maintainability and understandability. Moreover,
classes tend to strongly rely on their data representation, which makes for a brittle
design.

Refactoring a Data Class should focus on restoring a good data-behaviour proximity. In
most cases, that means moving the operations defined on the data back into the class.
In some other cases it may make sense to remove entirely the class and move the data
into the former client classes.

Example(s):
```
public class DataClass {

  public int bar = 0;
  public int na = 0;
  private int bee = 0;

  public void setBee(int n) {
    bee = n;
  }
}
```
