Since: PMD 4.0

The conversion of literals to strings by concatenating them with empty strings is inefficient.
It is much better to use one of the type-specific `toString()` methods instead or `String.valueOf()`.

Example(s):
```
String s = "" + 123;                // inefficient
String t = Integer.toString(456);   // preferred approach
```
