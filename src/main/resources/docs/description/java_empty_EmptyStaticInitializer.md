Since: PMD 1.5

An empty static initializer serve no purpose and should be removed.

Example(s):
```
public class Foo {
	static {
	// empty
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/empty.html#EmptyStaticInitializer)
