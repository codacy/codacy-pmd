Since: PMD 5.0

A for-in loop in which the variable name is not explicitly scoped to the enclosing scope with the 'var' keyword can
refer to a variable in an enclosing scope outside the nearest enclosing scope.  This will overwrite the
existing value of the variable in the outer scope when the body of the for-in is evaluated.  When the for-in loop
has finished, the variable will contain the last value used in the for-in, and the original value from before
the for-in loop will be gone.  Since the for-in variable name is most likely intended to be a temporary name, it
is better to explicitly scope the variable name to the nearest enclosing scope with 'var'.

Example(s):
```
// Ok
function foo() {
   var p = 'clean';
   function() {
	   var obj = { dirty: 'dirty' };
	   for (var p in obj) { // Use 'var' here.
	     obj[p] = obj[p];
	   }
	   return x;
   }();

   // 'p' still has value of 'clean'.
}
// Bad
function bar() {
   var p = 'clean';
   function() {
	   var obj = { dirty: 'dirty' };
	   for (p in obj) { // Oh no, missing 'var' here!
	     obj[p] = obj[p];
	   }
	   return x;
   }();

   // 'p' is trashed and has value of 'dirty'!
}
```
