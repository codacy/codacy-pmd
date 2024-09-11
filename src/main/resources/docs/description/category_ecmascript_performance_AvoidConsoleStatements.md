Since: PMD 7.5.0

Using the console for logging in production might negatively impact performance.
In addition, logging could expose sensitive data.

Example(s):
```
var myObj = getData();
console.log(myObj); // bad
console.debug("myObj:", myObj); // bad
```
