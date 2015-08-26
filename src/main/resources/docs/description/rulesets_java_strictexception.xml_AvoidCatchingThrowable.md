Catching Throwable errors is not recommended since its scope is very broad. It includes runtime issues such as OutOfMemoryError that should be exposed and managed separately.

Ex:

public void bar() {
	try {
     // do something
    } catch (Throwable th) {  // should not catch Throwable
		th.printStackTrace();
    }
  }
	
[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strictexception.html#AvoidCatchingThrowable)
