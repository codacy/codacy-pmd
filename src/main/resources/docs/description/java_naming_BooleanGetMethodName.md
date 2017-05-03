Since: PMD 4.0

Methods that return boolean results should be named as predicate statements to denote this.
I.e, 'isReady()', 'hasValues()', 'canCommit()', 'willFail()', etc.   Avoid the use of the 'get'
prefix for these methods.

Example(s):
```
public boolean getFoo(); 	// bad
public boolean isFoo(); 	// ok
public boolean getFoo(boolean bar); // ok, unless checkParameterizedMethods=true
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/naming.html#BooleanGetMethodName)
