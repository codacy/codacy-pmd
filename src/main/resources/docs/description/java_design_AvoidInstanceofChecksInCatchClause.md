Since: PMD 3.0

Each caught exception type should be handled in its own catch clause.

Example(s):
```
try { // Avoid this
 // do something
} catch (Exception ee) {
 if (ee instanceof IOException) {
  cleanup();
 }
}
try {  // Prefer this:
 // do something
} catch (IOException ee) {
 cleanup();
}
```
