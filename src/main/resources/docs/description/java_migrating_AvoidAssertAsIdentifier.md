Since: PMD 3.4

Use of the term 'assert' will conflict with newer versions of Java since it is a reserved word.

Example(s):
```
public class A {
	public  class foo {
		String assert = "foo";
	}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/migrating.html#AvoidAssertAsIdentifier)
