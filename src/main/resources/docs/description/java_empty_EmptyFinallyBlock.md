Since: PMD 0.4

Empty finally blocks serve no purpose and should be removed.

Example(s):
```
public class Foo {
 public void bar() {
  try {
    int x=2;
   } finally {
    // empty!
   }
 }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/empty.html#EmptyFinallyBlock)
