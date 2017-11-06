Since: PMD 3.8

Catch blocks that merely rethrow a caught exception only add to code size and runtime complexity.

Example(s):
```
public void bar() {
    try {
        // do something
    }  catch (SomeException se) {
       throw se;
    }
}
```
