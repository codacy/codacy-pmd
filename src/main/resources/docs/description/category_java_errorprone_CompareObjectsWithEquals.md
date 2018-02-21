Since: PMD 3.2

Use equals() to compare object references; avoid comparing them with ==.

Example(s):
```
class Foo {
  boolean bar(String a, String b) {
    return a == b;
  }
}
```
