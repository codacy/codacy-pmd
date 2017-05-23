Since: PMD 3.5

Consecutively calling StringBuffer/StringBuilder.append with String literals

Example(s):
```
StringBuffer buf = new StringBuffer();
buf.append("Hello").append(" ").append("World"); // poor
buf.append("Hello World");        				 // good
```
