Since: PMD 7.0.0

Java 10 introduced the `var` keyword. This reduces the amount of code written because java can infer the type
from the initializer of the variable declaration.

This is essentially a trade-off: On the one hand, it can make code more readable by eliminating redundant
information. On the other hand, it can make code less readable by eliding useful information. There is no
blanket rule for when `var` should be used or shouldn't.

It may make sense to use `var` when the type is inherently clear upon reading the statement
(ie: assignment to either a literal value or a constructor call). Those use cases
can be enabled through properties.

Notice that lambda parameters are allowed, as they are already inferred  by default (the `var` keyword
is completely optional).

See also [Local Variable Type Inference Style Guidelines](https://openjdk.org/projects/amber/guides/lvti-style-guide).

Example(s):
```

```
