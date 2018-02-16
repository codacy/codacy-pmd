Since: PMD 1.5

If the finalize() is implemented, it should do something besides just calling super.finalize().

Example(s):
```
protected void finalize() {
    super.finalize();
}
```
