Since: PMD 2.0

Identifies private fields whose values never change once object initialization ends either in the declaration
of the field or by a constructor. This helps in converting existing classes to becoming immutable ones.
Note that this rule does not enforce referenced object to be immutable itself. A class can still be mutable, even
if all its member fields are declared final. This is referred to as shallow immutability. For more information on
mutability, see Effective Java, 3rd Edition, Item 17: Minimize mutability.

Note: The property `ignoredAnnotations` is deprecated since PMD 6.52.0 and doesn't have any effect anymore.
Since PMD 6.47.0, the rule only considers fields, that are initialized once and never changed. If the field is just
declared but never explicitly initialized, it won't be reported. That's the typical case when a framework sets
the field value by reflection. Therefore, the property is not needed anymore. If there is a special case where
this rule misidentifies fields as immutable, then the rule should be suppressed for these fields explicitly.

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
