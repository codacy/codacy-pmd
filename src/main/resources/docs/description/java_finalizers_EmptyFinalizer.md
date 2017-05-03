Since: PMD 1.5

Empty finalize methods serve no purpose and should be removed.

Example(s):
```
public class Foo {
   protected void finalize() {}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/finalizers.html#EmptyFinalizer)
