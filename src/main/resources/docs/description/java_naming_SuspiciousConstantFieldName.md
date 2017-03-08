Since: PMD 2.0

Field names using all uppercase characters - Sun's Java naming conventions indicating constants - should
be declared as final.

Example(s):
```
public class Foo {
 // this is bad, since someone could accidentally
 // do PI = 2.71828; which is actually e
 // final double PI = 3.16; is ok
  double PI = 3.16;
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/naming.html#SuspiciousConstantFieldName)
