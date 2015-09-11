In J2EE, the `getClassLoader()` method might not work as expected. Use `Thread.currentThread().getContextClassLoader()` instead.

Ex:

```
public class Foo {
 ClassLoader cl = Bar.class.getClassLoader();
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/j2ee.html#UseProperClassLoader)
