Since: PMD 4.2.6

Statements in a catch block that invoke accessors on the exception without using the information
only add to code size.  Either remove the invocation, or use the return result.

Example(s):
```
public void bar() {
	try {
		// do something
	} catch (SomeException se) {
		se.getMessage();
	}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/strictexception.html#AvoidLosingExceptionInformation)
