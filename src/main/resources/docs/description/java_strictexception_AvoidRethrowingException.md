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

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/strictexception.html#AvoidRethrowingException)
