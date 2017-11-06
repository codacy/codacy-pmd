Since: PMD 5.1

This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines
of code for a given method. NCSS ignores comments, and counts actual statements. Using this algorithm,
lines of code that are split are counted as one.

Example(s):
```
CREATE OR REPLACE PACKAGE BODY AS
 FUNCTION methd RETURN INTEGER IS
 BEGIN
   RETURN 1;;
 END;
END;
```
