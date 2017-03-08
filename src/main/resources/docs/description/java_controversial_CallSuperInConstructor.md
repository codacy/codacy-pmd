Since: PMD 3.0

It is a good practice to call super() in a constructor. If super() is not called but
another constructor (such as an overloaded constructor) is called, this rule will not report it.

Example(s):
```
public class Foo extends Bar{
  public Foo() {
   // call the constructor of Bar
   super();
  }
 public Foo(int code) {
  // do something with code
   this();
   // no problem with this
  }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/controversial.html#CallSuperInConstructor)
