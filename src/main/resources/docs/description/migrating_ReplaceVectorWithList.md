Consider replacing `Vector` usages with the newer `java.util.ArrayList` if expensive thread-safe operations are not required.

Ex:

```
public class Foo {
  void bar() {
    Vector v = new Vector();
  }
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/migrating.html#ReplaceVectorWithList)
