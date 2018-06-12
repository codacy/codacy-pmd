Since: PMD 1.0

This rule detects when a constructor is not necessary; i.e., when there is only one constructor and the
constructor is identical to the default constructor. The default constructor should has same access
modifier as the declaring class. In an enum type, the default constructor is implicitly private.

Example(s):
```
public class Foo {
  public Foo() {}
}
```
