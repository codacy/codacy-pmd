Since: PMD 1.8

Using Exceptions as form of flow control is not recommended as they obscure true exceptions when debugging.
Either add the necessary validation or use an alternate control structure.

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
