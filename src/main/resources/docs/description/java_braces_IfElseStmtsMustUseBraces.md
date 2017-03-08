Since: PMD 0.2

Avoid using if..else statements without using surrounding braces. If the code formatting 
or indentation is lost then it becomes difficult to separate the code being controlled 
from the rest.

Example(s):
```
// this is OK
if (foo) x++;
   
   // but this is not
if (foo)
       x = x+1;
   else
       x = x-1;
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/braces.html#IfElseStmtsMustUseBraces)
