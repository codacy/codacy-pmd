Since: PMD 1.5

If the finalize() is implemented, it should do something besides just calling super.finalize(). Note that Oracle has declared Object.finalize() as deprecated since JDK 9.

Example(s):
```
protected void finalize() {
    super.finalize();
}
```
