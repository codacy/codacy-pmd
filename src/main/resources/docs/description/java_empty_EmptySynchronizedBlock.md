Since: PMD 1.3

Empty synchronized blocks serve no purpose and should be removed.

Example(s):
```
public class Foo {
 public void bar() {
  synchronized (this) {
   // empty!
  }
 }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/empty.html#EmptySynchronizedBlock)
