Since: PMD 3.3

Position literals first in comparisons, if the second argument is null then NullPointerExceptions 
can be avoided, they will just return false.

Example(s):
```
class Foo {
  boolean bar(String x) {
    return x.equals("2"); // should be "2".equals(x)
  }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#PositionLiteralsFirstInComparisons)
