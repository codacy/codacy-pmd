Since: PMD 3.7

In J2EE, the getClassLoader() method might not work as expected. Use 
Thread.currentThread().getContextClassLoader() instead.

Example(s):
```
public class Foo {
    ClassLoader cl = Bar.class.getClassLoader();
}
```
