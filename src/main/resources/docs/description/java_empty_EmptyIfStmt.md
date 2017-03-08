Since: PMD 0.1

Empty If Statement finds instances where a condition is checked but nothing is done about it.

Example(s):
```
public class Foo {
 void bar(int x) {
  if (x == 0) {
   // empty!
  }
 }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/empty.html#EmptyIfStmt)
