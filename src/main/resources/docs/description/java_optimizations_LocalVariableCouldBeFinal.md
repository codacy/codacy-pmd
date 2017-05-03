Since: PMD 2.2

A local variable assigned only once can be declared final.

Example(s):
```
public class Bar {
	public void foo () {
		String txtA = "a"; 		// if txtA will not be assigned again it is better to do this:
		final String txtB = "b";
	}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/optimizations.html#LocalVariableCouldBeFinal)
