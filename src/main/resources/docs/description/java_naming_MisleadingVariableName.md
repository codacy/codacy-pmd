Since: PMD 3.4

Detects when a non-field has a name starting with 'm_'.  This usually denotes a field and could be confusing.

Example(s):
```
public class Foo {
    private int m_foo; // OK
    public void bar(String m_baz) {  // Bad
      int m_boz = 42; // Bad
    }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/naming.html#MisleadingVariableName)
