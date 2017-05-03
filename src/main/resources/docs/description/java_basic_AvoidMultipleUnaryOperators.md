Since: PMD 4.2

The use of multiple unary operators may be problematic, and/or confusing.
Ensure that the intended usage is not a bug, or consider simplifying the expression.

Example(s):
```
// These are typo bugs, or at best needlessly complex and confusing:
int i = - -1;
int j = + - +1;
int z = ~~2;
boolean b = !!true;
boolean c = !!!true;

// These are better:
int i = 1;
int j = -1;
int z = 2;
boolean b = true;
boolean c = false;

// And these just make your brain hurt:
int i = ~-2;
int j = -~7;
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/basic.html#AvoidMultipleUnaryOperators)
