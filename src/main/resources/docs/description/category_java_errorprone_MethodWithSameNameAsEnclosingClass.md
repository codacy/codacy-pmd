Since: PMD 1.5

A method should not have the same name as its containing class.
This would be confusing as it would look like a constructor.

Example(s):
```
public class MyClass {

    public MyClass() {}         // this is OK because it is a constructor

    public void MyClass() {}    // this is bad because it is a method
}
```
