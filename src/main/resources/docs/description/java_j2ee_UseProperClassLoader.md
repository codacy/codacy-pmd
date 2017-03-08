Since: PMD 3.7

In J2EE, the getClassLoader() method might not work as expected. Use 
Thread.currentThread().getContextClassLoader() instead.

Example(s):
```
public class Foo {
 ClassLoader cl = Bar.class.getClassLoader();
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/j2ee.html#UseProperClassLoader)
