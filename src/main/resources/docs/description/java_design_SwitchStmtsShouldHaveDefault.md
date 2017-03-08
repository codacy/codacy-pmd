Since: PMD 1.0

All switch statements should include a default option to catch any unspecified values.

Example(s):
```
public void bar() {
    int x = 2;
    switch (x) {
      case 1: int j = 6;
      case 2: int j = 8;
      				// missing default: here
    }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#SwitchStmtsShouldHaveDefault)
