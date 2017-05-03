Since: PMD 5.0

An unnecessary Block is present.  Such Blocks are often used in other languages to
    introduce a new variable scope.  Blocks do not behave like this in ECMAScipt, and using them can
    be misleading.  Considering removing this unnecessary Block.

Example(s):
```
if (foo) {
   // Ok
}
if (bar) {
   {
      // Bad
   }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-javascript/rules/ecmascript/unnecessary.html#UnnecessaryBlock)
