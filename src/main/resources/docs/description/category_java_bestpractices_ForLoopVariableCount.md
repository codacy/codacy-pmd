Since: PMD 6.11.0

Having a lot of control variables in a 'for' loop makes it harder to see what range of values
the loop iterates over. By default this rule allows a regular 'for' loop with only one variable.

Example(s):
```
// this will be reported with the default setting of at most one control variable in a for loop
for (int i = 0, j = 0; i < 10; i++, j += 2) {
   foo();
```
