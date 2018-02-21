Since: PMD 4.2.5

Catch blocks that merely rethrow a caught exception wrapped inside a new instance of the same type only add to
code size and runtime complexity.

Example(s):
```
public void bar() {
    try {
        // do something
    } catch (SomeException se) {
        // harmless comment
        throw new SomeException(se);
    }
}
```
