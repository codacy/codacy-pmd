Since: PMD 0.8

Avoid passing parameters to methods or constructors without actually referencing them in the method body.

Example(s):
```
public class Foo {
	private void bar(String howdy) {
	// howdy is not used
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/unusedcode.html#UnusedFormalParameter)
