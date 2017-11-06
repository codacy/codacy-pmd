Since: PMD 5.0.1

This rule checks for usages of parseInt. While the second parameter is optional and usually defaults
to 10 (base/radix is 10 for a decimal number), different implementations may behave differently.
It also improves readability, if the base is given.

See also: [parseInt()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/parseInt)

Example(s):
```
parseInt("010");    // unclear, could be interpreted as 10 or 7 (with a base of 7)

parseInt("10", 10); // good
```
