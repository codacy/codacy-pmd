Since: PMD 1.1

When overriding the finalize(), the new method should be set as protected.  If made public, 
other classes may invoke it at inappropriate times.

Example(s):
```
public void finalize() {
	// do something
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/finalizers.html#FinalizeShouldBeProtected)
