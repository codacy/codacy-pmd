Since: PMD 1.0

Reassigning values to incoming parameters is not recommended.  Use temporary local variables instead.

Example(s):
```
public class Foo {
  private void foo(String bar) {
    bar = "something else";
  }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#AvoidReassigningParameters)
