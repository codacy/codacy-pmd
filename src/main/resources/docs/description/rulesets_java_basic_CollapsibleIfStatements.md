Since: PMD 3.1

Sometimes two consecutive 'if' statements can be consolidated by separating their conditions with a boolean short-circuit operator.

Example(s):
```
void bar() {
    if (x) {            // original implementation
        if (y) {
            // do stuff
        }
    }
}

void bar() {
    if (x && y) {        // optimized implementation
        // do stuff
    }
}
```
