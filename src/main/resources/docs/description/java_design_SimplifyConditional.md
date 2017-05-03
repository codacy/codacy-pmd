Since: PMD 3.1

No need to check for null before an instanceof; the instanceof keyword returns false when given a null argument.

Example(s):
```
class Foo {
  void bar(Object x) {
    if (x != null && x instanceof Bar) {
      // just drop the "x != null" check
    }
  }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#SimplifyConditional)
