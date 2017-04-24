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
