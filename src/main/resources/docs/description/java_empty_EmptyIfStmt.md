Empty `if` statement finds instances where a condition is checked but nothing is done about it.

Ex:

```
public class Foo {
  void bar(int x) {
    if (x == 0) {
      // empty!
    }
  }
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/empty.html#EmptyIfStmt)
