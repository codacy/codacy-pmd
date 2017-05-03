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

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#CompareObjectsWithEquals)
