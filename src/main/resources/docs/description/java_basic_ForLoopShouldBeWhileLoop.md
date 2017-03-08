Since: PMD 1.02

Some for loops can be simplified to while loops, this makes them more concise.

Example(s):
```
public class Foo {
	void bar() {
		for (;true;) true; // No Init or Update part, may as well be: while (true)
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/basic.html#ForLoopShouldBeWhileLoop)
