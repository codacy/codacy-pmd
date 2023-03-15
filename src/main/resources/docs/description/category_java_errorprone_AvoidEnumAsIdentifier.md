Since: PMD 3.4

Use of the term `enum` will conflict with newer versions of Java since it is a reserved word.

Since Java 1.5, the token `enum` became a reserved word and using it as an identifier will
result in a compilation failure for Java 1.5 and later. This rule is therefore only useful
for old Java code before Java 1.5. It can be used to identify problematic code prior to a Java update.

Example(s):
```
public class A {
    public class Foo {
        String enum = "foo";
    }
}
```
