Since: PMD 6.13.0

`do {} while (true);` requires reading the end of the statement before it is
apparent that it loops forever, whereas `while (true) {}` is easier to understand.

`do {} while (false);` is redundant, and if an inner variable scope is required,
a block `{}` is sufficient.

`while (false) {}` will never execute the block and can be removed in its entirety.

Example(s):
```
public class Example {
  {
    while (true) { } // allowed
    while (false) { } // disallowed
    do { } while (true); // disallowed
    do { } while (false); // disallowed
  }
}
```
