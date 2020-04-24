Since: PMD 6.23.0

Field declarations should appear before method declarations within a class.

Example(s):
```
class Foo {
    public Integer someField; // good

    public void someMethod() {
    }

    public Integer anotherField; // bad
}
```
