Since: PMD 5.0

ECMAScript does provide for return types on functions, and therefore there is no solid rule as to their usage.
However, when a function does use returns they should all have a value, or all with no value.  Mixed return
usage is likely a bug, or at best poor style.

Example(s):
```
// Ok
function foo() {
   if (condition1) {
      return true;
   }
   return false;
}

// Bad
function bar() {
   if (condition1) {
      return;
   }
   return false;
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-javascript/rules/ecmascript/basic.html#ConsistentReturn)
