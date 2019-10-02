Since: PMD 6.15.0

When declaring and initializing array fields or variables, it is not necessary to explicitly create a new array
using `new`. Instead one can simply define the initial content of the array as a expression in curly braces.

E.g. `int[] x = new int[] { 1, 2, 3 };` can be written as `int[] x = { 1, 2, 3 };`.

Example(s):
```
Foo[] x = new Foo[] { ... }; // Overly verbose
Foo[] x = { ... }; //Equivalent to above line
```
