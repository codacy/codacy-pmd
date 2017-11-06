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
