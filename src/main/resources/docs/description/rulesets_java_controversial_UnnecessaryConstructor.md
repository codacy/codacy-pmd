Since: PMD 1.0

This rule detects when a constructor is not necessary; i.e., when there is only one constructor,
it's public, has an empty body, and takes no arguments.

Example(s):
```
public class Foo {
  public Foo() {}
}
```
