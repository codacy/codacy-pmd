Since: PMD 2.0

The method name and parameter number are suspiciously close to equals(Object), which can denote an
intention to override the equals(Object) method.

Example(s):
```
public class Foo {
   public int equals(Object o) {
     // oops, this probably was supposed to be boolean equals
   }
   public boolean equals(String s) {
     // oops, this probably was supposed to be equals(Object)
   }
   public boolean equals(Object o1, Object o2) {
     // oops, this probably was supposed to be equals(Object)
   }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/naming.html#SuspiciousEqualsMethodName)
