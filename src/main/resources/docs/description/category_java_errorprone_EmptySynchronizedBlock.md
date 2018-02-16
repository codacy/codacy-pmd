Since: PMD 1.3

Empty synchronized blocks serve no purpose and should be removed.

Example(s):
```
public class Foo {
    public void bar() {
        synchronized (this) {
            // empty!
        }
    }
}
```
