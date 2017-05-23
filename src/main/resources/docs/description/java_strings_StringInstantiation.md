Since: PMD 1.0

Avoid instantiating String objects; this is usually unnecessary since they are immutable and can be safely shared.

Example(s):
```
private String bar = new String("bar"); // just do a String bar = "bar";
```
