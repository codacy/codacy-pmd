Since: PMD 3.4

Use of the term 'assert' will conflict with newer versions of Java since it is a reserved word.

Example(s):
```
public class A {
    public class Foo {
        String assert = "foo";
    }
}
```
