Since: PMD 1.0

Empty switch statements serve no purpose and should be removed.

Example(s):
```
public void bar() {
	int x = 2;
	switch (x) {
	// once there was code here
	// but it's been commented out or something
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/empty.html#EmptySwitchStatements)
