Since: PMD 3.1

Fields whose scopes are limited to just single methods do not rely on the containing
object to provide them to other methods. They may be better implemented as local variables
within those methods.

Example(s):
```
public class Foo {
    private int x;  // no reason to exist at the Foo instance level
    public void foo(int y) {
     x = y + 5;
     return x;
    }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#SingularField)
