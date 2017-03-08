Since: PMD 4.1

A class with only private constructors should be final, unless the private constructor 
is invoked by a inner class.

Example(s):
```
public class Foo {  //Should be final
    private Foo() { }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#ClassWithOnlyPrivateConstructorsShouldBeFinal)
