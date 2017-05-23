Since: PMD 1.5

A non-static initializer block will be called any time a constructor is invoked (just prior to
invoking the constructor).  While this is a valid language construct, it is rarely used and is
confusing.

Example(s):
```
public class MyClass {
 // this block gets run before any call to a constructor
  {
   System.out.println("I am about to construct myself");
  }
}
```
