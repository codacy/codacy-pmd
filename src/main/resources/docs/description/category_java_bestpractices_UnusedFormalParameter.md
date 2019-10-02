Since: PMD 0.8

Avoid passing parameters to methods or constructors without actually referencing them in the method body. 
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
