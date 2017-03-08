Since: PMD 4.2

Throwing exceptions within a 'finally' block is confusing since they may mask other exceptions 
or code defects.
Note: This is a PMD implementation of the Lint4j rule "A throw in a finally block"

Example(s):
```
public class Foo {
	public void bar() {
		try {
			// Here do some stuff
		} catch( Exception e) {
			// Handling the issue
		} finally {
			// is this really a good idea ?
			throw new Exception();
		}
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/strictexception.html#DoNotThrowExceptionInFinally)
