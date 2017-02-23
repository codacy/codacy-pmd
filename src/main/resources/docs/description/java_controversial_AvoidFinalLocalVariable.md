Avoid using final local variables. Instead turn them into fields. It is not a good practice to instantiate something final inside a method.

Ex:

```
public class MyClass {
  public void foo() {
    final String finalLocalVariable;
  }
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/controversial.html#AvoidFinalLocalVariable)
