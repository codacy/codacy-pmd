Since: PMD 1.0

Avoid calling toString() on objects already known to be string instances; this is unnecessary.

Example(s):
```
private String baz() {
    String bar = "howdy";
    return bar.toString();
}
```
