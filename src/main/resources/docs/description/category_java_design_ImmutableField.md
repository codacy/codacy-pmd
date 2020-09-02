Since: PMD 2.0

Identifies private fields whose values never change once object initialization ends either in the declaration
of the field or by a constructor. This helps in converting existing classes to becoming immutable ones.
Note that this rule does not enforce referenced object to be immutable itself. A class can still be mutable, even
if all its member fields are declared final. This is referred to as shallow immutability. For more information on
mutability, see Effective Java, 3rd Edition, Item 17: Minimize mutability.

Example(s):
```
public class Foo {
  private int x; // could be final
  public Foo() {
      x = 7;
  }
  public void foo() {
     int a = x + 2;
  }
}
```
