Since: PMD 5.1

This rule helps improve code portability due to differences in browser treatment of trailing commas in object or array literals.

Example(s):
```
function(arg) {
    var obj1 = { a : 1 }; // Ok
    var arr1 = [ 1, 2 ]; // Ok

    var obj2 = { a : 1, }; // Syntax error in some browsers!
    var arr2 = [ 1, 2, ]; // Length 2 or 3 depending on the browser!
}
```
