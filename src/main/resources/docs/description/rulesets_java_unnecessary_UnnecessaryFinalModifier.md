Since: PMD 3.0

When a class has the final modifier, all the methods are automatically final and do not need to be
tagged as such. Similarly, methods that can't be overridden (private methods, methods of anonymous classes,
methods of enum instance) do not need to be tagged either.

Example(s):
```
public final class Foo {
    // This final modifier is not necessary, since the class is final
    // and thus, all methods are final
    private final void foo() {
    }
}
```
