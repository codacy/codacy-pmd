Empty `switch` statements should be removed since they serve no purpose whatsoever.

Ex:

```
public void bar() {
  int x = 2;
  switch (x) {
    //empty switch statement
  }
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/empty.html#EmptySwitchStatements)
