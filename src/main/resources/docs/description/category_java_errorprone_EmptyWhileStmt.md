Since: PMD 0.2

Empty While Statement finds all instances where a while statement does nothing.  
If it is a timing loop, then you should use Thread.sleep() for it; if it is
a while loop that does a lot in the exit expression, rewrite it to make it clearer.

Example(s):
```
void bar(int a, int b) {
    while (a == b) {
        // empty!
    }
}
```
