Since: PMD 1.5

If the finalize() is implemented, it should do something besides just calling super.finalize().

Example(s):
```
protected void finalize() {
	super.finalize();
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/finalizers.html#FinalizeOnlyCallsSuperFinalize)
