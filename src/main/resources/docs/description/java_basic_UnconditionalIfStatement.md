Since: PMD 1.5

Do not use &quot;if&quot; statements whose conditionals are always true or always false.

Example(s):
```
public class Foo {
	public void close() {
		if (true) {		// fixed conditional, not recommended
			// ...
		}
	}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/basic.html#UnconditionalIfStatement)
