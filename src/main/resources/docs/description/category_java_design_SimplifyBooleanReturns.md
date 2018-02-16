Since: PMD 0.9

Avoid unnecessary if-then-else statements when returning a boolean. The result of
the conditional test can be returned instead.

Example(s):
```
public boolean isBarEqualTo(int x) {
    if (bar == x) {      // this bit of code...
        return true;
    } else {
        return false;
    }
}

public boolean isBarEqualTo(int x) {
    return bar == x;    // can be replaced with this
}
```
