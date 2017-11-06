Since: PMD 3.4

Use of the term 'enum' will conflict with newer versions of Java since it is a reserved word.

Example(s):
```
public class A {
    public class Foo {
        String enum = "foo";
    }
}
```
