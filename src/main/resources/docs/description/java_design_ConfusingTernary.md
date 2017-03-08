Since: PMD 1.9

Avoid negation within an "if" expression with an "else" clause.  For example, rephrase:

  if (x != y) diff(); else same();
as:
  if (x == y) same(); else diff();

Most "if (x != y)" cases without an "else" are often return cases, so consistent use of this 
rule makes the code easier to read.  Also, this resolves trivial ordering problems, such
as "does the error case go first?" or "does the common case go first?".

Example(s):
```
boolean bar(int x, int y) {
  return (x != y) ? diff : same;
 }
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#ConfusingTernary)
