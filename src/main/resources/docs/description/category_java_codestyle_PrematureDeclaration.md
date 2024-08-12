Since: PMD 5.0

Checks for variables that are defined before they might be used. A declaration is
deemed to be premature if there are some statements that may return or throw an
exception between the time the variable is declared and the time it is first read.

Some variables cannot be declared close to their first usage because of side-effects
occurring before they're first used. We try to avoid reporting those by considering
most method and constructor invocations to be impure. See the second example.

Note that this rule is meant to improve code readability but is not an optimization.
A smart JIT will not care whether the variable is declared prematurely or not, as it
can reorder code.

Example(s):
```
public int getLength(String[] strings) {

    int length = 0; // could be moved closer to the loop

    if (strings == null || strings.length == 0) return 0;

    for (String str : strings) {
        length += str.length();
    }

    return length;
}

        

public int getLength(String[] strings) {

    int startTime = System.nanoTime(); // cannot be moved because initializer is impure

    if (strings == null || strings.length == 0) {
        // some error logic
        throw new SomeException(...);
    }

    for (String str : strings) {
        length += str.length();
    }

    return System.nanoTime() - startTime;
}
```
