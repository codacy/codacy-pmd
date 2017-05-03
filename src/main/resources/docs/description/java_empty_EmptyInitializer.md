Since: PMD 5.0

Empty initializers serve no purpose and should be removed.

Example(s):
```
public class Foo {

   static {} // Why ?

   {} // Again, why ?

}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/empty.html#EmptyInitializer)
