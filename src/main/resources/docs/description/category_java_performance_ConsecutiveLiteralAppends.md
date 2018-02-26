Since: PMD 3.5

Consecutively calling StringBuffer/StringBuilder.append(...) with literals should be avoided.
Since the literals are constants, they can already be combined into a single String literal and this String
can be appended in a single method call.

Example(s):
```
StringBuilder buf = new StringBuilder();
buf.append("Hello").append(" ").append("World");    // poor
buf.append("Hello World");                          // good

buf.append('h').append('e').append('l').append('l').append('o'); // poor
buf.append("hello");                                             // good

buf.append(1).append('m');  // poor
buf.append("1m");           // good
```
