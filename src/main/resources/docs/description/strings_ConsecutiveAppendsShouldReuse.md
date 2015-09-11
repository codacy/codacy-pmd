Consecutively calls to `StringBuffer`/`StringBuilder.append` should reuse the target object. This can improve the performance.

Ex:

```
String foo = " ";

StringBuffer buf = new StringBuffer();
buf.append("Hello"); // poor
buf.append(foo);
buf.append("World");

StringBuffer buf = new StringBuffer();
buf.append("Hello").append(foo).append("World"); // good
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#ConsecutiveAppendsShouldReuse)
