Since: PMD 1.8

This rule reports exceptions thrown and caught in an enclosing try statement.
This use of exceptions as a form of `goto` statement is discouraged, as that may
hide actual exceptions, and obscures control flow, especially when debugging.
To fix a violation, add the necessary validation or use an alternate control structure.

Example(s):
```
public void bar() {
    try {
        try {
        } catch (Exception e) {
            throw new WrapperException(e);
            // this is essentially a GOTO to the WrapperException catch block
        }
    } catch (WrapperException e) {
        // do some more stuff
    }
}
```
