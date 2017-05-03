Since: PMD 3.9

This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines
of code for a given constructor. NCSS ignores comments, and counts actual statements. Using this algorithm,
lines of code that are split are counted as one.

Example(s):
```
public class Foo extends Bar {
 public Foo() {
     super();





 //this constructor only has 1 NCSS lines
      super.foo();
 }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/codesize.html#NcssConstructorCount)
