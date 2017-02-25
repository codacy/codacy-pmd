Using `Exceptions` as form of flow control is not recommended as they obscure true exceptions when debugging. Either add the necessary validation or use an alternate control structure.

Ex:

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

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strictexception.html#ExceptionAsFlowControl)
