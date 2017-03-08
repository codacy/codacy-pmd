Since: PMD 0.7

Avoid using 'for' statements without using curly braces. If the code formatting or 
indentation is lost then it becomes difficult to separate the code being controlled 
from the rest.

Example(s):
```
for (int i = 0; i < 42; i++)
   foo();
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/braces.html#ForLoopsMustUseBraces)
