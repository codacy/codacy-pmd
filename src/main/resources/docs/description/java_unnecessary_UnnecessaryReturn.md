Avoid the use of unnecessary `return` statements. Since it will not do anything to your code.

Ex:

```
public class Foo {
	public void bar() {
		int x = 42;
		return;
	}
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/unnecessary.html#UnnecessaryReturn)
