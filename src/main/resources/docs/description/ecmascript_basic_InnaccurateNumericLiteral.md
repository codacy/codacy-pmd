Since: PMD 5.0

The numeric literal will have at different value at runtime, which can happen if you provide too much
precision in a floating point number.  This may result in numeric calculations being in error.

Example(s):
```
var a = 9; // Ok
var b = 999999999999999; // Ok
var c = 999999999999999999999; // Not good
var w = 1.12e-4; // Ok
var x = 1.12; // Ok
var y = 1.1234567890123; // Ok
var z = 1.12345678901234567; // Not good
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-javascript/rules/ecmascript/basic.html#InnaccurateNumericLiteral)
