Since: PMD 6.4.0

Identical `catch` branches use up vertical space and increase the complexity of code without
            adding functionality. It's better style to collapse identical branches into a single multi-catch
            branch.

Example(s):
```
try {
    // do something
} catch (IllegalArgumentException e) {
    throw e;
} catch (IllegalStateException e) { // Can be collapsed into the previous block
    throw e;
}

try {
    // do something
} catch (IllegalArgumentException | IllegalStateException e) { // This is better
    throw e;
}
```
