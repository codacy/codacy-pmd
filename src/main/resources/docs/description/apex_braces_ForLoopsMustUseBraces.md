Since: PMD 5.6.0

Avoid using 'for' statements without using surrounding braces. If the code formatting or
indentation is lost then it becomes difficult to separate the code being controlled
from the rest.

Example(s):
```
for (int i = 0; i < 42; i++) // not recommended
    foo();

for (int i = 0; i < 42; i++) { // preferred approach
    foo();
}
```
