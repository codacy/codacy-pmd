Since: PMD 5.0

Avoid using if statements without using curly braces.

Example(s):
```
// Ok
if (foo) {
    x++;
}

// Bad
if (foo)
    x++;
```
