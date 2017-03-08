Since: PMD 5.1

Consecutive calls to StringBuffer/StringBuilder .append should be chained, reusing the target object. This can improve the performance
by producing a smaller bytecode, reducing overhead and improving inlining. A complete analysis can be found [here](https://github.com/pmd/pmd/issues/202#issuecomment-274349067)

Example(s):
```
String foo = " ";

StringBuffer buf = new StringBuffer();
buf.append("Hello"); // poor
buf.append(foo);
buf.append("World");

StringBuffer buf = new StringBuffer();
buf.append("Hello").append(foo).append("World"); // good
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/strings.html#ConsecutiveAppendsShouldReuse)
