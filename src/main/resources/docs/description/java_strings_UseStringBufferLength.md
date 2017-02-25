Use `StringBuffer.length()` to determine `StringBuffer` length rather than using `StringBuffer.toString().equals("")` or `StringBuffer.toString().length() == 5`

Ex:

```
StringBuffer sb = new StringBuffer();

if (sb.toString().equals("")) {
  // inefficient
}	   

if (sb.length() == 0) {
  // preferred
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#UseStringBufferLength)
