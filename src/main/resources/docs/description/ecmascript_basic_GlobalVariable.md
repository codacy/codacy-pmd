Since: PMD 5.0

This rule helps to avoid using accidently global variables by simply missing the "var" declaration.
Global variables can lead to side-effects that are hard to debug.

Example(s):
```
function(arg) {
    notDeclaredVariable = 1; // this will create a global variable and trigger the rule

    var someVar = 1; // this is a local variable, that's ok

    window.otherGlobal = 2; // this will not trigger the rule, although it is a global variable.
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-javascript/rules/ecmascript/basic.html#GlobalVariable)
