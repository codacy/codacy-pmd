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
