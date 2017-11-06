Since: PMD 1.5

Empty finalize methods serve no purpose and should be removed.

Example(s):
```
public class Foo {
   protected void finalize() {}
}
```
