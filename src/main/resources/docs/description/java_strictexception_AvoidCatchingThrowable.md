Since: PMD 1.2

Catching Throwable errors is not recommended since its scope is very broad. It includes runtime issues such as 
OutOfMemoryError that should be exposed and managed separately.

Example(s):
```
public void bar() {
	try {
     // do something
    } catch (Throwable th) {  // should not catch Throwable
		th.printStackTrace();
    }
  }
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/strictexception.html#AvoidCatchingThrowable)
