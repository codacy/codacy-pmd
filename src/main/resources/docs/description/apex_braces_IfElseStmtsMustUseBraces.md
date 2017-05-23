Since: PMD 5.6.0

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
