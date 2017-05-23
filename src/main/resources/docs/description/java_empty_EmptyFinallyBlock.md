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
