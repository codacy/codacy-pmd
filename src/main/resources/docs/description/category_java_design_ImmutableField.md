Since: PMD 2.0

Reports non-final fields whose value never changes once object initialization ends,
and hence may be marked final.

Note that this rule does not enforce that the field value be deeply immutable itself.
An object can still have mutable state, even if all its member fields are declared final.
This is referred to as shallow immutability. For more information on mutability,
see *Effective Java, 3rd Edition, Item 17: Minimize mutability*.

Limitations: We can only check private fields for now.

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
