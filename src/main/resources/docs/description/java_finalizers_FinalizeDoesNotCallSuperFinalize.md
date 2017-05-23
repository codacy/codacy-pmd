Since: PMD 1.5

If the finalize() is implemented, its last action should be to call super.finalize.

Example(s):
```
protected void finalize() {
	something();
	// neglected to call super.finalize()
}
```
