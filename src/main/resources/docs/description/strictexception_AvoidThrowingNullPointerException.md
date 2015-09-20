Avoid throwing `NullPointerExceptions`. These are confusing because most people will assume that the virtual machine threw it. Consider using an `IllegalArgumentException` instead; this will be clearly seen as a programmer-initiated exception.

Ex:

```
void foo(String s) {
  if (s == null)
    throw new IllegalArgumentException("s cannot be null");
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strictexception.html#AvoidThrowingNullPointerException)
