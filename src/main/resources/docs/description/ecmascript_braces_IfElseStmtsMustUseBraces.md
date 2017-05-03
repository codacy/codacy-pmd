Since: PMD 5.0

Avoid using if..else statements without using curly braces.

Example(s):
```
// Ok
if (foo) {
   x++;
} else {
   y++;
}

// Bad
if (foo)
   x++;
else
   y++;
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-javascript/rules/ecmascript/braces.html#IfElseStmtsMustUseBraces)
