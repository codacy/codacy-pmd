Methods that declare the generic `Exception` as a possible throwable are not very helpful since their failure modes are unclear. Use a class derived from `RuntimeException` or a more specific checked exception.

Ex:

```
public void foo() throws Exception { }
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strictexception.html#SignatureDeclareThrowsException)
