Since: PMD 5.0

Avoid using 'while' statements without using curly braces.

Example(s):
```
// Ok
while (true) {
   x++;
}

// Bad
while (true)
   x++;
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-javascript/rules/ecmascript/braces.html#WhileLoopsMustUseBraces)
