Use String.indexOf(char) when checking for the index of a single character; it executes faster.

Ex:

String s = "hello world";
  // avoid this
if (s.indexOf("d") {}
  // instead do this
if (s.indexOf('d') {}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#UseIndexOfChar)
