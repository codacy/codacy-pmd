Since: PMD 3.4

Use of the term 'enum' will conflict with newer versions of Java since it is a reserved word.

Example(s):
```
public class A {
	public  class foo {
		String enum = "foo";
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/migrating.html#AvoidEnumAsIdentifier)
