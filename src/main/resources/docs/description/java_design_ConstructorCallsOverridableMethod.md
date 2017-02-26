Calling overridable methods during construction poses a risk of invoking methods on an incompletely constructed object and can be difficult to debug.
It may leave the `subclass` unable to construct its `superclass` or forced to replicate the construction process completely within itself, losing the ability to call `super()`.
If the default constructor contains a call to an overridable `method`, the `subclass` may be completely uninstantiable.

Note that this includes method calls throughout the control flow graph - i.e., if a constructor `Foo()` calls a private method `bar()` that calls a public method `buz()`, this denotes a problem.

Ex:

```
public class SeniorClass {
  public SeniorClass(){
    toString(); //may throw NullPointerException if overridden
  }
  public String toString(){
    return "IAmSeniorClass";
  }
}
public class JuniorClass extends SeniorClass {
  private String name;
  public JuniorClass(){
    super(); //Automatic call leads to NullPointerException
    name = "JuniorClass";
  }
  public String toString(){
    return name.toUpperCase();
  }
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/design.html#ConstructorCallsOverridableMethod)
