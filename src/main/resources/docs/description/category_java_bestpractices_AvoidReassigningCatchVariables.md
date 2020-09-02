Since: PMD 6.27.0

Reassigning exception variables caught in a catch statement should be avoided because of:

1) If it is needed, multi catch can be easily added and code will still compile.

2) Following the principle of least surprise we want to make sure that a variable caught in a catch statement
is always the one thrown in a try block.

Example(s):
```
public class Foo {
    public void foo() {
        try {
            // do something
        } catch (Exception e) {
            e = new NullPointerException(); // not recommended
        }

        try {
            // do something
        } catch (MyException | ServerException e) {
            e = new RuntimeException(); // won't compile
        }
    }
}
```
