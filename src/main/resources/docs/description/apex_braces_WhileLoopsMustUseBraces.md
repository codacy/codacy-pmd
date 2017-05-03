Since: PMD 5.6.0

Avoid using 'while' statements without using braces to surround the code block. If the code
formatting or indentation is lost then it becomes difficult to separate the code being
controlled from the rest.

Example(s):
```
while (true)	// not recommended
      x++;

while (true) {	// preferred approach
      x++;
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-apex/rules/apex/braces.html#WhileLoopsMustUseBraces)
