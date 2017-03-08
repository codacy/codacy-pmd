Since: PMD 5.0

Avoid assignments in operands; this can make code more complicated and harder to read.  This is sometime
indicative of the bug where the assignment operator '=' was used instead of the equality operator '=='.

Example(s):
```
var x = 2;
// Bad
if ((x = getX()) == 3) {
   alert('3!');
}

function getX() {
  return 3;
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-javascript/rules/ecmascript/basic.html#AssignmentInOperand)
