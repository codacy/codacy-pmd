Since: PMD 4.1

Avoid using final local variables, turn them into fields.

Example(s):
```
public class MyClass {
    public void foo() {
        final String finalLocalVariable;
    }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/controversial.html#AvoidFinalLocalVariable)
