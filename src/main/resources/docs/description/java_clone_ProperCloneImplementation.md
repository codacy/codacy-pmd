The clone method is used to create a copy of an object of a class which implements `Cloneable` interface.

Object clone() should be implemented with super.clone().

Ex:

```
class Foo{
  public Object clone() {
    return new Foo(); // This is bad
  }
}

class Foo{
  public Object clone() {
    Foo clone = (Foo)super.clone();
    return clone;
  }
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/clone.html#ProperCloneImplementation)
