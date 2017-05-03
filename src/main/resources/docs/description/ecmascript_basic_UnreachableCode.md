Since: PMD 5.0

A 'return', 'break', 'continue', or 'throw' statement should be the last in a block. Statements after these
will never execute.  This is a bug, or extremely poor style.

Example(s):
```
// Ok
function foo() {
   return 1;
}
// Bad
function bar() {
   var x = 1;
   return x;
   x = 2;
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-javascript/rules/ecmascript/basic.html#UnreachableCode)
