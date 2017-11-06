Since: PMD 5.0.1

Avoid using with - it's bad news

Example(s):
```
with (object) {
    property = 3; // Might be on object, might be on window: who knows.
}
```
