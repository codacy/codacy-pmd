Since: PMD 5.1

This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines
of code for a given Oracle object. NCSS ignores comments, and counts actual statements. Using this algorithm,
lines of code that are split are counted as one.

Example(s):
```
CREATE OR REPLACE PACKAGE pkg_
 PROCEDURE Foo IS
 BEGIN
 --this class only has 6 NCSS lines
     super();
     super();
 END;
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-plsql/rules/plsql/codesize.html#NcssObjectCount)
