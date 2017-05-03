Since: PMD 1.0

This rule detects when a constructor is not necessary; i.e., when there is only one constructor,
its public, has an empty body, and takes no arguments.

Example(s):
```
public class Foo {
  public Foo() {}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/controversial.html#UnnecessaryConstructor)
