Since: PMD 1.5

Empty finalize methods serve no purpose and should be removed. Note that Oracle has declared Object.finalize() as deprecated since JDK 9.

Example(s):
```
public class Foo {
   protected void finalize() {}
}
```
