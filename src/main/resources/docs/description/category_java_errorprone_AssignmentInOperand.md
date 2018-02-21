Since: PMD 1.03

Avoid assignments in operands; this can make code more complicated and harder to read.

Example(s):
```
public void bar() {
    int x = 2;
    if ((x = getX()) == 3) {
      System.out.println("3!");
    }
}
```
