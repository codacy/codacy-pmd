Since: PMD 1.5

If the finalize() is implemented, its last action should be to call super.finalize. Note that Oracle has declared Object.finalize() as deprecated since JDK 9.

Example(s):
```
protected void finalize() {
    something();
    // neglected to call super.finalize()
}
```
