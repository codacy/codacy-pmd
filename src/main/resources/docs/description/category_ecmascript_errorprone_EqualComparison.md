Since: PMD 5.0

Using == in condition may lead to unexpected results, as the variables are automatically casted to be of the
same type. The === operator avoids the casting.

Example(s):
```
// Ok
if (someVar === true) {
  ...
}
// Ok
if (someVar !== 3) {
  ...
}
// Bad
if (someVar == true) {
  ...
}
// Bad
if (someVar != 3) {
  ...
}
```
