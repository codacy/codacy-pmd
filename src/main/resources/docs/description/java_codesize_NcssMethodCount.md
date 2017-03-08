Since: PMD 3.9

This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines
of code for a given method. NCSS ignores comments, and counts actual statements. Using this algorithm,
lines of code that are split are counted as one.

Example(s):
```
public class Foo extends Bar {
 public int methd() {
     super.methd();





 //this method only has 1 NCSS lines
      return 1;
 }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/codesize.html#NcssMethodCount)
