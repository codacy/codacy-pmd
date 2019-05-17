Since: PMD 6.7.0

Apex allows the use of several variables declaration of the same type on one line. However, it
can lead to quite messy code. This rule looks for several declarations on the same line.

Example(s):
```
Integer a, b;   // not recommended

Integer a,
        b;      // ok by default, can be flagged setting the strictMode property

Integer a;      // preferred approach
Integer b;
```
