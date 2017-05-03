Since: PMD 0.1

Detects when a local variable is declared and/or assigned, but not used.

Example(s):
```
public class Foo {
	public void doSomething() {
		int i = 5; // Unused
	}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/unusedcode.html#UnusedLocalVariable)
