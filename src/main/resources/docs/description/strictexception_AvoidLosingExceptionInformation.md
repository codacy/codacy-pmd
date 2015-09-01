Statements in a catch block that invoke accessors on the exception without using the information only add to code size. Either remove the invocation, or use the return result.

Ex:

public void bar() {
	try {
		// do something
	} catch (SomeException se) {
		se.getMessage();
	}
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strictexception.html#AvoidLosingExceptionInformation)
