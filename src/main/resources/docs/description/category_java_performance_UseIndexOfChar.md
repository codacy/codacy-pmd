Since: PMD 3.5

Use String.indexOf(char) when checking for the index of a single character; it executes faster.

Example(s):
```
String s = "hello world";
// avoid this
if (s.indexOf("d") {}
// instead do this
if (s.indexOf('d') {}
```
