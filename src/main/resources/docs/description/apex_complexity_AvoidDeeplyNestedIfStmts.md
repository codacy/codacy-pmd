Since: PMD 5.5.0

Avoid creating deeply nested if-then statements since they are harder to read and error-prone to maintain.

Example(s):
```
public class Foo {
	public void bar(Integer x, Integer y, Integer z) {
		if (x>y) {
			if (y>z) {
				if (z==x) {
					// !! too deep
				}
			}
		}
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-apex/rules/apex/complexity.html#AvoidDeeplyNestedIfStmts)
