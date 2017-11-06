Since: PMD 5.5.3

Detect classes declared without explicit sharing mode if DML methods are used. This
forces the developer to take access restrictions into account before modifying objects.

Example(s):
```
public without sharing class Foo {
    // DML operation here
}
```
