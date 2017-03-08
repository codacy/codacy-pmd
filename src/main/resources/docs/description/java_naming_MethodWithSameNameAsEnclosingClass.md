Since: PMD 1.5

Non-constructor methods should not have the same name as the enclosing class.

Example(s):
```
public class MyClass {

	public MyClass() {}			// this is OK because it is a constructor
	
	public void MyClass() {}	// this is bad because it is a method
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/naming.html#MethodWithSameNameAsEnclosingClass)
