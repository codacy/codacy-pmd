Since: PMD 5.5.0

The else block in a if-else-construct is unnecessary if the `if` block contains a return.
    Then the content of the else block can be put outside.
    
    See also: http://eslint.org/docs/rules/no-else-return

Example(s):
```
// Bad:
if (x) {
  return y;
} else {
  return z;
}

// Good:
if (x) {
  return y;
}
return z;
```
