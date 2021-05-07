Since: PMD 0.8

Reports parameters of methods and constructors that are not referenced them in the method body.
Parameters whose name starts with `ignored` or `unused` are filtered out.

Removing unused formal parameters from public methods could cause a ripple effect through the code base.
Hence, by default, this rule only considers private methods. To include non-private methods, set the
`checkAll` property to `true`.

Example(s):
```
public class Foo {
    private void bar(String howdy) {
        // howdy is not used
    }
}
```
