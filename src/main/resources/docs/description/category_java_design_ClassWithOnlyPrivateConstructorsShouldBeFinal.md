Since: PMD 4.1

Reports classes that may be made final because they cannot be extended from outside
their compilation unit anyway. This is because all their constructors are private,
so a subclass could not call the super constructor.

Example(s):
```
public class Foo {  //Should be final
    private Foo() { }
}
```
