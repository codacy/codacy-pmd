Since: PMD 1.9

Tests for null should not use the equals() method. The '==' operator should be used instead.

Example(s):
```
String x = "foo";

if (x.equals(null)) { // bad form
   	doSomething();
	}
	
if (x == null) { 	// preferred
   	doSomething();
	}
```
