Since: PMD 5.0

The numeric literal will have a different value at runtime, which can happen if you provide too much
precision in a floating point number.  This may result in numeric calculations being in error.

[Numbers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number) in JavaScript
are represented by 64bit double-precision floating point numbers internally and that's why there are some limits
to the available precision of the number.
See [Number.isSafeInteger()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isSafeInteger)
and [Number.EPSILON](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/EPSILON).

Note: This rule was named InnaccurateNumericLiteral before PMD 7.4.0.

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
