Since: PMD 6.2.0

Avoid the use of value in annotations when it's the only element.

Example(s):
```
@TestClassAnnotation(value = "TEST")
public class Foo {

    @TestMemberAnnotation(value = "TEST")
    private String y;

    @TestMethodAnnotation(value = "TEST")
    public void bar() {
        int x = 42;
        return;
    }
}

// should be

@TestClassAnnotation("TEST")
public class Foo {

    @TestMemberAnnotation("TEST")
    private String y;

    @TestMethodAnnotation("TEST")
    public void bar() {
        int x = 42;
        return;
    }
}
```
