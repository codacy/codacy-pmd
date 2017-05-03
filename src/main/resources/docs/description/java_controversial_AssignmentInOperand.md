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

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/controversial.html#AssignmentInOperand)
