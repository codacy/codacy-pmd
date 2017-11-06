Since: PMD 2.0

Avoid instantiating an object just to call getClass() on it; use the .class public member instead.

Example(s):
```
// replace this
Class c = new String().getClass();

// with this:
Class c = String.class;
```
