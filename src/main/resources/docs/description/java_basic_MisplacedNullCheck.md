Since: PMD 3.5

The null check here is misplaced. If the variable is null a NullPointerException will be thrown.
Either the check is useless (the variable will never be &quot;null&quot;) or it is incorrect.

Example(s):
```
public class Foo {
	void bar() {
		if (a.equals(baz) && a != null) {}
		}
}
    
      
public class Foo {
	void bar() {
		if (a.equals(baz) || a == null) {}
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/basic.html#MisplacedNullCheck)
