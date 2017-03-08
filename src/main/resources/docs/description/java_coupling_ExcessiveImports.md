Since: PMD 1.04

A high number of imports can indicate a high degree of coupling within an object. This rule 
counts the number of unique imports and reports a violation if the count is above the 
user-specified threshold.

Example(s):
```
import blah.blah.Baz;
import blah.blah.Bif;
// 18 others from the same package elided
public class Foo {
 public void doWork() {}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/coupling.html#ExcessiveImports)
