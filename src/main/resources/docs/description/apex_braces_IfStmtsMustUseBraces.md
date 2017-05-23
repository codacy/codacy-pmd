Since: PMD 5.6.0

Avoid using if statements without using braces to surround the code block. If the code
formatting or indentation is lost then it becomes difficult to separate the code being
controlled from the rest.

Example(s):
```
if (foo)	// not recommended
	x++;

if (foo) {	// preferred approach
	x++;
}
```
