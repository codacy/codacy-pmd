Since: PMD 1.5

If the finalize() is implemented, its last action should be to call super.finalize.

Example(s):
```
protected void finalize() {
	something();
	// neglected to call super.finalize()
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/finalizers.html#FinalizeDoesNotCallSuperFinalize)
