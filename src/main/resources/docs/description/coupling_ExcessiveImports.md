A high number of imports can indicate a high degree of coupling within an object. This rule counts the number of unique imports and reports a violation if the count is above the user-specified threshold.

Coupling is bad because it prevents the replacement or changes of components independently of the whole.

Ex:

```
import blah.blah.Baz;
import blah.blah.Bif;
// 18 others from the same package elided
public class Foo {
 public void doWork() {}
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/coupling.html#ExcessiveImports)
