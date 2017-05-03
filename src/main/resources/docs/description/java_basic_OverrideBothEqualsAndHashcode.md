Since: PMD 0.4

Override both public boolean Object.equals(Object other), and public int Object.hashCode(), or override neither.  Even if you are inheriting a hashCode() from a parent class, consider implementing hashCode and explicitly delegating to your superclass.

Example(s):
```
public class Bar {		// poor, missing a hashcode() method
	public boolean equals(Object o) {
      // do some comparison
	}
}

public class Baz {		// poor, missing an equals() method
	public int hashCode() {
      // return some hash value
	}
}

public class Foo {		// perfect, both methods provided
	public boolean equals(Object other) {
      // do some comparison
	}
	public int hashCode() {
      // return some hash value
	}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/basic.html#OverrideBothEqualsAndHashcode)
