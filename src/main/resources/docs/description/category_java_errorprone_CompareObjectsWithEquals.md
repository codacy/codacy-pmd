Since: PMD 3.2

Use `equals()` to compare object references; avoid comparing them with `==`.

Since comparing objects with named constants is useful in some cases (eg, when
defining constants for sentinel values), the rule ignores comparisons against
fields with all-caps name (eg `this == SENTINEL`), which is a common naming
convention for constant fields.

You may allow some types to be compared by reference by listing the exceptions
in the `typesThatCompareByReference` property.

Example(s):
```
class Foo {
  boolean bar(String a, String b) {
    return a == b;
  }
}
```
