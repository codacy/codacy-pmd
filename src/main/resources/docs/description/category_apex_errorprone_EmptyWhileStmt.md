Since: PMD 6.0.0

Empty While Statement finds all instances where a while statement does nothing.
If it is a timing loop, then you should use Thread.sleep() for it; if it is
a while loop that does a lot in the exit expression, rewrite it to make it clearer.

Example(s):
```
public void bar(Integer a, Integer b) {
  while (a == b) {
    // empty!
  }
}
```
