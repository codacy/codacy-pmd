Since: PMD 5.5.0

This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines
of code for a given type. NCSS ignores comments, and counts actual statements. Using this algorithm,
lines of code that are split are counted as one.

Example(s):
```
//this class only has 6 NCSS lines
public class Foo extends Bar {
    public Foo() {
        super();





        super.foo();
    }
}
```
