Since: PMD 5.5.0

Non-constructor methods should not have the same name as the enclosing class.

Example(s):
```
public class MyClass {
	// this is OK because it is a constructor
	public MyClass() {}
	// this is bad because it is a method
	public void MyClass() {}
}
```
