An empty static initializer serve no purpose and therefore should be removed.

Ex:

```
public class Foo {
  static {
    // empty
  }
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/empty.html#EmptyStaticInitializer)
